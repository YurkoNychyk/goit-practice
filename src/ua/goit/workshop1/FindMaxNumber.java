package ua.goit.workshop1;

/**
 * Created by home on 27.04.2016.
 */
public class FindMaxNumber {
    public static void main(String[] args) {
        int[] input = new int[]{1,25,3,4,10};
        System.out.println(max(input));
    }
    public static int max(int[] input) {
        int max=input[0];
        for (int i = 1; i < input.length; i++) {
            if (max < input[i]){
                max = input[i];
            }
        }
        return max;
    }
}
