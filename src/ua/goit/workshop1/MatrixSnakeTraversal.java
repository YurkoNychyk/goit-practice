package ua.goit.workshop1;

import com.sun.deploy.util.ArrayUtil;

/**
 * Created by home on 27.04.2016.
 */
public class MatrixSnakeTraversal {
    public static void main(String[] args) {
        int[][] inputArray3 = new int[][]{
                {1,2},
                {3,4}
        };
        int[] outputArray3 = print(inputArray3);
        printArray(outputArray3);

        int[][] inputArray = new int[][] {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int[] outputArray = print(inputArray);
        printArray(outputArray);
        int[][] inputArray2 = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[] outputArray2 = print(inputArray2);
        printArray(outputArray2);


    }

    public static int[] print(int[][] input) {
        int lastRow = input.length;
        int lastColumn = input[0].length;

        int[] vector = new int[lastColumn*lastRow];

        for (int i=0; i < vector.length;){
            for (int col = 0; col < lastColumn; col++) {
                int temp = col%2;
                if (col%2 == 0) {
                    for (int row = 0; row < lastRow; row++) {
                        vector[i] = input[row][col];
                        i++;
                    }
                }
                else {
                    for (int row = lastRow-1; row >= 0; row--) {
                        vector[i] = input[row][col];
                        i++;
                    }
                }
            }
        }
        return vector;
    }

    public static void printArray (int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }




}
