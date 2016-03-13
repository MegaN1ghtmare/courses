package com.rxn1d.courses.Bets;

import com.rxn1d.courses.RouletteNumber;

/**
 * Created by Администратор on 13.03.2016.
 */
public class BetBigSmall extends Bet {
    public BetBigSmall(BetType type, String playerName, int value) {
        this.type = type;
        this.playerName = playerName;
        this.value = value;
        multiplier = 1;
    }

    public boolean isWon(RouletteNumber number) {
        int digit = number.getNumber();
        if (digit == 0) {
            return false;
        } else if (digit >= 19 && type == BetType.BIG) {
            return true;
        } else if (digit <= 18 && type == BetType.SMALL) {
            return true;
        } else {
            return false;
        }
    }
}
