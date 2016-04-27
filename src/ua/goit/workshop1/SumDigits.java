package ua.goit.workshop1;

/**
 * Created by home on 27.04.2016.
 */
public class SumDigits {
    public static void main(String[] args) {
        int inputNumber = 123;
        System.out.println(sum(inputNumber));
    }
    public static int sum(int number) {
        char[] digits = Integer.toString(number).toCharArray();
        int resultingSum = 0;
        for (char ch:digits
             ) {
            if (Character.isDigit(ch)) {
                resultingSum += Character.getNumericValue(ch);
            }
        }
        return resultingSum;
    }
}
