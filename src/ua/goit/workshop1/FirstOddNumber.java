package ua.goit.workshop1;

/**
 * Created by home on 27.04.2016.
 */
public class FirstOddNumber {
    public static void main(String[] args) {
        int[] inputIntegerArray = new int[]{-2,-4,1,4};
        System.out.println(find(inputIntegerArray));
    }

    public static int find(int[] input) {
        int result = -1;
        for (int i = 0; i <input.length; i++) {
            if (input[i] % 2 != 0){
                result = i;
                break;
            }
        }
        return result;
    }
}
