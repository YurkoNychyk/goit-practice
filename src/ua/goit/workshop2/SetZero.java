package ua.goit.workshop2;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by home on 11.05.2016.
 */
public class SetZero {
    public static void main(String[] args) {
        System.out.println(set(-1,31));
    }
    public static int set(int num, int i) {
        StringBuilder numString = new StringBuilder(Integer.toBinaryString(num));
        if(i<=numString.length()) {
            numString.replace(numString.length() - i, numString.length() - i + 1, "0");
        }
        System.out.println(numString);

        Long longInt = Long.valueOf(numString.toString(),2);
        return longInt.intValue();
    }
}
