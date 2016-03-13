package com.rxn1d.courses.Bets;

import com.rxn1d.courses.RouletteNumber;

/**
 * Created by Администратор on 13.03.2016.
 */
public class BetOddEven extends Bet {
    public BetOddEven(BetType type, String playerName, int value) {
        this.type = type;
        this.playerName = playerName;
        this.value = value;
        multiplier = 1;
    }

    public boolean isWon(RouletteNumber number) {
        int digit = number.getNumber();
        if (digit == 0) {
            return false;
        } else if (digit % 2 == 0 && type == BetType.EVEN) {
            return true;
        } else if (digit % 2 != 0 && type == BetType.ODD) {
            return true;
        } else {
            return false;
        }
    }
}
