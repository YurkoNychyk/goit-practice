package ua.goit.workshop2;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by home on 11.05.2016.
 */
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(add("11111111111111111111111111111011111111111111111111111111111111111111111111","11111111111111111111111111111111111111111111111111111111111111111111111111"));

    }
    public static String add(String a, String b) {
        List<Character> aDigits = new ArrayList<>();
        List<Character> bDigits = new ArrayList<>();
        //List<Character> result = new ArrayList<>();
        aDigits.add('0');
        bDigits.add('0');
        //result.add('0');
        for (int i = a.length()-1; i>=0; i--){
            aDigits.add(a.charAt(i));
            bDigits.add(b.charAt(i));
        }

        StringBuilder resultString = new StringBuilder('0');
        Character nextRegister = new Character('0');
        final Character charToCompare = new Character('1');
        for (int i = aDigits.size()-1;i >=0; i--){
            if (( aDigits.get(i).charValue() == bDigits.get(i).charValue() ) && ( aDigits.get(i).charValue() == charToCompare.charValue() ) || nextRegister == '1' ){
                nextRegister = '1';
                //result.add('1');
                resultString.append('1');
            }
            else {

                nextRegister = '0';
                if ( bDigits.get(i) == '0' || aDigits.get(i) == '0') {
                  //  result.add('0');
                    resultString.append('0');
                }
                else {
                    //result.add('1');
                    resultString.append('1');
                }
            }
        }
        if (nextRegister == '1'){
            //result.set(0,'1');
            resultString.setCharAt(0,'1');
        }


        return resultString.toString();
    }
}
