package com.valentinaplatzi.javatests.util;

public class StringUtilTest {

    public static void main(String[] args) {

        String result = StringUtil.repeat("hola", 3);
        if (result.equals("holaholahola")){
            System.out.println("OK");
        }

        String result2 = StringUtil.repeat("hola", 1);
        System.out.println(result2);
    }
}