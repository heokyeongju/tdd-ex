package com.ll.exam;

public class Calculator {
    public static int calc(String s){
        boolean isSubtract = s.indexOf(" - ") != -1;
        boolean isMultiply = s.indexOf(" * ") != -1;

        if (isSubtract) {
            return subtract(s);
        }
        else if(isMultiply){
            return multiply(s);
        }

        return add(s);
    }

    private static int add(String s){
        String[] sBits = s.split(" \\+ ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1+no2;
    }
    private static int subtract(String s){
        String[] sBits = s.split(" \\- ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1-no2;
    }
    private static int multiply(String s) {
        String[] sBits = s.split(" \\* ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 * no2;
    }

}
