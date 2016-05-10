package ua.goit.workshop2;

import java.math.BigDecimal;

/**
 * Created by home on 10.05.2016.
 */
public class AverageNumber {
    public static void main(String[] args) {
        System.out.println(average(1073741824,1073741824));
    }
    public static int average(int a, int b) {
        BigDecimal bigA = new BigDecimal(a);
        BigDecimal bigB = new BigDecimal(b);
        BigDecimal sum = bigA.add(bigB);
        int average = sum.divide(new BigDecimal(2)).intValue();
        return average;
    }
}
