package com.rxn1d.courses.Bets;

import com.rxn1d.courses.RouletteNumber;

/**
 * Created by Администратор on 13.03.2016.
 */
public class BetColor extends Bet {
    public BetColor(BetType type, String playerName, int value) {
        this.type = type;
        this.playerName = playerName;
        this.value = value;
        multiplier = 1;
    }

    public boolean isWon(RouletteNumber number) {
        if (number.getColor().equals(type.toString())) {
            return true;
        }
        return false;
    }
}
