package com.company;


public class Calculate {
    public static double calculate (int a, int b, String action) {
        double result;
        switch (action) {
            case "plus": result = a + b;
            break;
            default:result = 0;
            break;
        }
        return result;
    }
}
