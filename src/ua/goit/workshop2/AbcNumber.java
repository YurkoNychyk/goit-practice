package ua.goit.workshop2;

/**
 * Created by home on 11.05.2016.
 */
public class AbcNumber {
    public static void main(String[] args) {
        System.out.println(convert("bcd"));
    }
    public static int convert(String num) {
        String result="";
        for (int i =0; i<num.length(); i++){
            result += (char)(num.charAt(i)-49);
        }
        return Integer.parseInt(result) ;

    }
}
