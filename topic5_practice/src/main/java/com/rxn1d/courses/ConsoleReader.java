package com.rxn1d.courses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Администратор on 13.03.2016.
 */
public class ConsoleReader {
    public static String[] readFromConsole() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferedReader.readLine();
            return input.split("\\s");
        } catch (IOException e) {
            return new String[]{""};
        }
    }
}
