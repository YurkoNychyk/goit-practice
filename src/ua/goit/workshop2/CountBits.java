package ua.goit.workshop2;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by home on 11.05.2016.
 */
public class CountBits {
    public static void main(String[] args) {
        System.out.println(count(-2147483647));
    }

    public static int count(int num) {
        String numString = Integer.toBinaryString(num);
        int result=0;
        for (int i =0; i<numString.length(); i++){
            result+=Character.getNumericValue(numString.charAt(i));
        }
        return result;
    }

}
