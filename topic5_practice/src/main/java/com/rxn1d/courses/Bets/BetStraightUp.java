package com.rxn1d.courses.Bets;

import com.rxn1d.courses.RouletteNumber;

/**
 * Created by Администратор on 13.03.2016.
 */
public class BetStraightUp extends Bet {
    private int number;

    public BetStraightUp(BetType type, String playerName, int value) {
        this.number = number;
        this.type = type;
        this.playerName = playerName;
        this.value = value;
        multiplier = 35;
    }

    public boolean isWon(RouletteNumber rNumber) {
        int digit = rNumber.getNumber();
        if (digit == number) {
            return true;
        } else {
            return false;
        }
    }
}
