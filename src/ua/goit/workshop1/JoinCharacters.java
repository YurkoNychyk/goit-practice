package ua.goit.workshop1;

import java.util.Arrays;
import java.util.Scanner;

public class JoinCharacters {

    public static void main(String[] args) {
        char[] inputArray = new char[]{'1','2','3'};
        join(inputArray);
    }
    public static int join(char[] input){
        StringBuffer integerString = new StringBuffer();
        for (char ch:input
             ) {
            if (Character.isDigit(ch)){
                System.out.println("Character" + ch + "is a digit");
                integerString.append(ch);
                System.out.println("Result string: " + integerString);
            }
            else {
                System.out.println("Character" + ch + "is not a digit");
            }
        }
        System.out.println("Integer String: " + integerString);
        return Integer.parseInt(integerString.substring(0));
    }
}
