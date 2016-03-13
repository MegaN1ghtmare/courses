package com.rxn1d.courses;

import com.rxn1d.courses.Bets.Bet;
import com.rxn1d.courses.Exceptions.IncorrectInputException;
import com.rxn1d.courses.Exceptions.TableIsFullException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Администратор on 13.03.2016.
 */
public class RouletteTable {
    private HashMap<String, Integer> players = new HashMap<>();
    private List<Bet> bets = new ArrayList<>();
    private String name;
    private int value;

    public HashMap<String, Integer> getPlayers() {
        return players;
    }

    public void addPlayer(String[] input) throws TableIsFullException, IncorrectInputException {
        if (players.size() < 5) {
            if (!players.containsKey(input[1])) {
                int balance;
                try {
                    balance = Integer.valueOf(input[2]);
                } catch (NumberFormatException e) {
                    throw new IncorrectInputException(Arrays.toString(input));
                }
                players.put(input[1], balance);
                System.out.println("New Player with name: " + input[1] + " and balance: " + balance + " is added to Roulette Table");
            } else {
                System.out.println("Player " + input[1] + " already at the Roulette Table");
            }
        } else {
            throw new TableIsFullException("No free place at the Roulette Table\n");
        }
    }

    public void addBet(Bet bet) {
        if (bets.size() == 0) {
            checkBalance(bet);
        } else {
            for (Bet b : bets) {
                if (b.getPlayerName().equalsIgnoreCase(bet.getPlayerName())) {
                    System.out.println("BET NOTE ACCEPTED");
                    return;
                }
            }
            checkBalance(bet);
        }
    }

    public void checkBalance(Bet b) {
        if (players.containsKey(b.getPlayerName()) && players.get(b.getPlayerName()) >= b.getValue()) {
            bets.add(b);
            Casino.addBetStatistics(b);
            System.out.println("BET ACCEPTED");
        } else {
            System.out.println("BET NOTE ACCEPTED");
        }
    }

    public void calculateGame(RouletteNumber number) {
        Casino.addNumberStatistics(number);
        for (Bet b : bets) {
            name = b.getPlayerName();
            value = b.getValue();
            int multiplier = b.getMultiplier();
            int balance = players.get(name);
            if (b.isWon(number)) {
                players.put(name, (balance + (value * multiplier)));
                Casino.addToCasinoBalance(-value * multiplier);
                System.out.println("Player: " + name + " + " + value * multiplier);
            } else {
                players.put(name, (balance - value));
                Casino.addToCasinoBalance(value);
                System.out.println("Player: " + name + " - " + value);
                if (players.get(name) == 0) {
                    players.remove(name);
                    System.out.println(name + " was kicked out from the Roulette Table for low balance!");
                }
            }
        }
        bets.clear();
    }
}
