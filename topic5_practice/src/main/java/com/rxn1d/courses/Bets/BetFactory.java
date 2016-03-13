package com.rxn1d.courses.Bets;

import com.rxn1d.courses.Exceptions.IncorrectInputException;

import java.util.Arrays;

/**
 * Created by Администратор on 13.03.2016.
 */
public class BetFactory {
    private static int value;
    private static int number;
    private static String betType;
    private static String playerName;
    private static Bet bet;

    public static Bet getBet(String[] input) throws IncorrectInputException {
        try {
            value = Integer.valueOf(input[2]);
            if (input.length == 5) {
                number = Integer.valueOf(input[4]);
            }
        } catch (NumberFormatException e) {
            incorrect(input);
        }
        betType = input[3];
        playerName = input[1];
        switch (betType.toLowerCase()) {
            case "red":
                bet = new BetColor(BetType.RED, playerName, value);
                break;
            case "black":
                bet = new BetColor(BetType.BLACK, playerName, value);
                break;
            case "big":
                bet = new BetBigSmall(BetType.BIG, playerName, value);
                break;
            case "small":
                bet = new BetBigSmall(BetType.SMALL, playerName, value);
                break;
            case "odd":
                bet = new BetOddEven(BetType.ODD, playerName, value);
                break;
            case "even":
                bet = new BetOddEven(BetType.EVEN, playerName, value);
                break;
            case "straight_up":
                bet = new BetStraightUp(BetType.STRAIGHT_UP, playerName, value);
                break;
            default:
                incorrect(input);
                break;
        }
        return bet;
    }

    private static void incorrect(String[] in) throws IncorrectInputException {
        throw new IncorrectInputException(Arrays.toString(in));
    }
}
