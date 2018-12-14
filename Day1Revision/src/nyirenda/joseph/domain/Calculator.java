/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyirenda.joseph.domain;

/**
 *
 * @author Administrator
 */
public class Calculator {

    public static double add(double d, double d0) {
        return d + d0;
    }

    public static double multiply(double d, double d0) {
        return d * d0;
    }

    public static double divide(double d, double d0) {
        return d / d0;
    }

    public static double subtract(double d, double d0) {
        return d - d0;
    }

    public static String add(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }

    public static double add(double[] myList) {
        double total = 0;
        for (double d : myList) {
            total += d;
        }
        return total;
    }

    public static double average(double[] myList) {
        if (myList.length == 0) {
            throw new IllegalArgumentException("Unable to compute average. Array has no elements");
        }
        return add(myList) / myList.length;
    }
}
