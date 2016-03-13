package com.rxn1d.courses;

import com.rxn1d.courses.Bets.Bet;
import com.rxn1d.courses.Bets.BetType;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Администратор on 13.03.2016.
 */
public class Casino {
    private static int casinoBalance;
    private static int betCounter;
    private static Map<BetType, Integer> bets = new HashMap<>();
    private static Map<RouletteNumber, Integer> numbers = new HashMap<>();

    public static void addToCasinoBalance(int addition) {
        casinoBalance += addition;
    }

    public static void addBetStatistics(Bet bet) {
        betCounter++;
        BetType type = bet.getType();
        if (bets.containsKey(type)) {
            bets.put(type, bets.get(type) + 1);
        } else {
            bets.put(type, 1);
        }
    }

    public static void addNumberStatistics(RouletteNumber number) {
        if (numbers.containsKey(number)) {
            numbers.put(number, numbers.get(number) + 1);
        } else {
            numbers.put(number, 1);
        }
    }

    public static void showStats(Map<String, Integer> players) {
        int numCounter = 1;
        RouletteNumber rNumber = null;
        System.out.println("STATS");
        System.out.println("Total bets count = " + betCounter);
        System.out.println("Total bets by type " + bets);
        System.out.println("Balance = " + casinoBalance);
        if (null != numbers) {
            for (Map.Entry<RouletteNumber, Integer> entry : numbers.entrySet()) {
                if (entry.getValue() > numCounter) {
                    numCounter = entry.getValue();
                    rNumber = entry.getKey();
                }
            }
            if (numCounter > 1) {
                System.out.println("Most frequent number = " + rNumber);
            } else {
                System.out.println("Frequency of numbers not more than 1");
            }
        }
        System.out.println(players);
    }
}
