package com.swcompsci;

public class randnamefromname {
    public static String nameout1(String x) {
        int length = x.length();
        int number1 = (int) (Math.random() * (length));
        String scifiorigin1 = "";
        scifiorigin1 += x.substring(0, number1 -1);
        return scifiorigin1;
    }

    public static String nameout2(String x) {
        int length = x.length();
        int number1 = (int) (Math.random() * (length));
        String scifiorigin2 = "";
        scifiorigin2 += x.substring(number1 -1, length - 1);
        return scifiorigin2;
    }
}
