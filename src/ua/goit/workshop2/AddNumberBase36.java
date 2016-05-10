package ua.goit.workshop2;

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
        Long sum = Long.valueOf(a,36) + Long.valueOf(b,36);
        return Long.toString(sum,36) ;
    }

    private static int toDecimal(String s) {
        final int OFFSET = 87;
        int number=0;
        char[] charactersOfString = s.toCharArray();
        int[] digitsOfString = new int[charactersOfString.length];

        for (int i = 0; i<charactersOfString.length; i++){
            if (Character.isLetter(charactersOfString[i])){
                digitsOfString[i] = (charactersOfString[i] - OFFSET) ;}
            else {
                digitsOfString[i] = Character.getNumericValue(charactersOfString[i]);
            }
            number += digitsOfString[i] * (int) Math.pow(36, digitsOfString.length - i - 1);
        }
        return number;
    }
    private static String toBase36(int number){
       final int OFFSET = 87;
        int[] digits = new int[]{-1,-1,-1,-1,-1};
       StringBuilder result = new StringBuilder();
        int j=0;
       while (number !=0){
           digits[j] = (number%36);
           number /= 36;
           j++;
       }
       char ch;
        int i=0;
       while ( i<digits.length && digits[i]!=-1){
           if (digits[i] > 9 ){
               ch = (char) (digits[i] + OFFSET);
           }
           else{
               ch = Integer.toString(digits[i]).charAt(0);
           }
           result.insert(0,ch);
           i++;
       }
       return result.toString();
   }
}
