package com.rxn1d.courses;

/**
 * Created by Denis on 21.02.2016.
 */
public class TestStringRemove {
    public static void main(String[] args){
        testRemoveSymbol("z","zazbzaz");
    }
    private static void testRemoveSymbol(String symbol, String word){
        String res = HomeWork2String.removeSymbolFromString(symbol,word);
        System.out.println("Word - "+word+"; remove symbol - "+symbol+"; Result - "+res);
    }
}
