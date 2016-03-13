package com.rxn1d.courses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Администратор on 13.03.2016.
 */
public class Roulette {
    private Random random = new Random();
    private List<RouletteNumber> wheel = new ArrayList<>();

    public Roulette() {
        String color;
        RouletteNumber rNumber = new RouletteNumber(0, "GREEN");
        wheel.add(rNumber);
        for (int i = 1; i < 37; i++) {
            color = "RED";
            rNumber = new RouletteNumber(i, color);
            wheel.add(rNumber);
        }
        for (int i = 1; i < 19; i++) {
            rNumber = wheel.get(random.nextInt(36) + 1);
            while (!rNumber.getColor().equals("RED")) {
                rNumber = wheel.get((random.nextInt(36) + 1));
            }
            rNumber.setColor("BLACK");
        }
    }

    public RouletteNumber getNumber() {
        int n = random.nextInt(37);
        return wheel.get(n);
    }

    public List<RouletteNumber> getWheel() {
        Collections.shuffle(wheel, random);
        return wheel;
    }
}
