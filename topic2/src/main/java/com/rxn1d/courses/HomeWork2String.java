package com.rxn1d.courses;

/**
 * Модифицируйте этот класс(файл)
 *
 * @author Ievgen Tararaka
 */
public class HomeWork2String {
    /**
     * Метод должен вернуть количество четных чисел в строке.
     * <p>Например:
     * дана строка - 1_4_8_11_22, ответ - 3
     *
     * @param s строка типа число1_число2_число3_число4
     * @return количество четных числе в строке
     */
    public static int countEvenInString(String s) {
        int EvenCounter = 0;
        String[] array = s.split("_");
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
            if ((intArray[i]) % 2 == 0)
                EvenCounter += 1;
        }
        return EvenCounter;
    }

    /**
     * Метод должен удалить указанный символ из строки (кроме случая, если
     * символ находится на первой, последней или срединной позиции)
     * <p>Например:
     * данна строка - xabxxxx, символ - x, ответ - xabx
     *
     * @param symbol символ который необходимо удалить
     * @param s      исходная строка
     * @return результирующая строка
     */
    public static String removeSymbolFromString(String symbol, String s) {
        String[] array = new String[] {s};
        String[] newArray = new String[array.length];
        newArray[0] = array[0];
        newArray[newArray.length - 1] = array[array.length - 1];
        for (int i = 1, j = 1; i < array.length - 1; i++) {
            if ((array[i].equals(symbol) && (array[((array.length) / 2)].equals(symbol)))) continue;
            newArray[j++] = array[i];
        }
        StringBuilder builder = new StringBuilder();
        for (String v : newArray){
            builder.append(v);
        }
        return builder.toString();
    }
}
