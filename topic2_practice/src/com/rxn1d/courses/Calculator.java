package com.rxn1d.courses;

/**
 * @author Ievgen Tararaka
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("---> START Calculator application <---");
        String[] in;
        double first;
        double second;
        double result = 0.0D;
        String operator;
        while (true) {
            in = ConsoleReader.readFromConsole();
            if (in[0].equals("exit"))break;
            else if (in[0].equals("C")){
                result = 0.0D;
            } else {
                if (in.length > 1 && in.length <= 3) {
                    if (in.length == 2){
                        operator = in[0];
                        first = result;
                        second = Double.parseDouble(in[1]);
                    } else {
                        operator = in[1];
                        first = Double.parseDouble(in[0]);
                        second = Double.parseDouble(in[2]);
                    }
                    result = Calculate(operator, first, second);
                }
            }
            System.out.println("Result: " + result);
        }
        System.out.println("---> EXIT Calculator application <---");
    }
    private static double Calculate(String operator, double first, double second) {
        switch (operator) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return first / second;
            case "^":
                return Math.pow(first, second);
        }
        return Double.NaN;
    }
}
