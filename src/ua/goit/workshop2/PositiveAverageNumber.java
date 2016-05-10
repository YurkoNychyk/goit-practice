package ua.goit.workshop2;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by home on 10.05.2016.
 */
public class PositiveAverageNumber {
    public static void main(String[] args) {
        System.out.println("1073741824,1073741824: " + average(1,2));
    }
    public static int average(int a, int b) {
        BigDecimal bigA = new BigDecimal(a);
        BigDecimal bigB = new BigDecimal(b);
        BigDecimal sum = bigA.add(bigB);
        int average = sum.divide(new BigDecimal(2)).intValue();
        return average;
    }
}
