package com.rxn1d.courses;

/**
 * Модифицируйте этот класс(файл)
 *
 * @author Ievgen Tararaka
 */
public class HomeWork2Loops {
    /**
     * Метод должен вернуть минимальное число
     * из заданного массива.
     * <p>Например:
     * вернуть число=3 при заданном массиве=[5, 4, 3, 4, 5]
     *
     * @param integers заданный массив типа int[]
     * @return минимальное число из массива
     */
    public static int min(int[] integers) {
        int min = integers[0];
        for (int i = 0; i < integers.length; i++) {
            if (min > integers[i])
                min = integers[i];
        }
        return min;
    }


    /**
     * Метод должен вернуть максимальное число
     * из заданного массива.
     * <p>Например:
     * вернуть число=6.0 при заданном массиве=[5.1, 4.33, 3.0, 6.0, 5.999]
     *
     * @param doubles заданный массив типа double[]
     * @return максимальное число из массива
     */
    public static double max(double[] doubles) {
        double max = doubles[0];
        for (int i = 0; i < doubles.length; i++) {
            if(max < doubles[i])
                max = doubles[i];
        }
        return max;
    }

    /**
     * Метод должен вернуть среднее арифмитическое число
     * из заданного массива.
     * <p>Например:
     * вернуть число=8 при заданном массиве=[1, 3, 8, 10, 25, 1]
     *
     * @param shorts заданный массив типа short[]
     * @return среднее арифмитическое число из массива
     */
    public static short average(short[] shorts) {
        int average = 0;
        if (shorts.length > 0) {
            int sum = 0;
            for (int i = 0; i < shorts.length; i++) {
                sum += shorts[i];
            }
            average = sum / shorts.length;
        }
        return (short) average;
    }

    /**
     * Метод должен перевернуть массив.
     * <p>Например:
     * вернуть массив=[f, e, d, c, b, a] из заданного массива=[a, b, c, d, e, f]
     *
     * @param chars заданный массив типа char[]
     * @return перевернутый массив
     */
    public static char[] reverse(char[] chars) {
        char[] mass = new char[chars.length];
        int i;
        int j = 0;
        for (i = 0; i < chars.length; i++) {
            mass[j++]= chars[chars.length-i-1];
        }
        return mass;
    }
}
