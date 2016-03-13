package com.rxn1d.courses;


import org.apache.commons.lang3.ArrayUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Администратор on 13.03.2016.
 */
public class CommandFileReader {
    private static String[][] commandFile;
    private static String[] input;
    public static BufferedReader br;

    public static String[][] readFromFile() throws IOException {
        commandFile = null;
        br = new BufferedReader(new FileReader("commands.txt"));
        String line = br.readLine();
        while (line != null) {
            input = line.split("\\s");
            commandFile = ArrayUtils.add(commandFile, input);
            line = br.readLine();
        }
        br.close();
        return commandFile;
    }
}
