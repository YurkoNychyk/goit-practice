package ua.goit.workshop2;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by home on 10.05.2016.
 */
public class AddNumberBase36 {
    public static void main(String[] args) {
        System.out.println();
       // System.out.println("9+1=" + add("9","1"));
        System.out.println("z+1=" + add("z","1"));
        System.out.println("z+1=" + add("zjfghfhdsdfathjjhgjhghjfjfjhjhdsrreqqklhu456hfz5","wsfgsgds56346263fgfhghfghfhgfsrr5476hjfgdhdhg3n"));
    }
    public static String add(String a, String b) {
        BigInteger numA = new BigInteger(a,36);
        BigInteger numB = new BigInteger(b,36);

        System.out.println(numA.add(numB));
        return numA.add(numB).toString(36);
    }


}
