package com.rxn1d.courses;

/**
 * Модифицируйте этот класс(файл)
 *
 * @author Ievgen Tararaka
 */
public class HomeWork2Equation {
    /**
     * Метод должен вернуть решение квадратического уравнения.
     * <p>Например:
     * Найти решение уравнение вида 5x^2 + 2x + 11
     *
     * @param a коэфициент для x^2
     * @param b коэфициент x
     * @param c константа
     * @return решение уравнения
     */
    public static int solveEquation(int a, int b, int c) {
        int discret = b * b - 4 * a * c;
        double result1 = ( -b + Math.sqrt(discret) ) / (2 * a);
        double result2 = ( -b - Math.sqrt(discret) ) / (2 * a);

        return (int) result1;
}
}