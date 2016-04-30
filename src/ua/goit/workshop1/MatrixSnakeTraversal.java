package ua.goit.workshop1;

import com.sun.deploy.util.ArrayUtil;

/**
 * Created by home on 27.04.2016.
 */
public class MatrixSnakeTraversal {
    public static void main(String[] args) {
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

        int[][] inputArray3 = new int[][]{
                {1,2},
                {3,4}
        };
        int[] outputArray3 = print(inputArray3);
        printArray(outputArray3);
    }

    public static int[] print(int[][] input) {
        int lastRow = input.length;
        int lastColumn = input[0].length;

        int[] vector = makeVector(input);

        int vectorIndex=lastRow;
        while (vectorIndex < vector.length){
            int[] tempArray = new int[lastRow];
            for (int i=0;i<tempArray.length;i++){
                tempArray[i] = vector[vectorIndex+i];
            }
            tempArray=reverseArray(tempArray);
            for (int i=0; i<tempArray.length; i++){
                vector[vectorIndex+i] = tempArray[i];
            }
            vectorIndex+=(lastRow)*2;
        }
        return vector;
    }

    public static void printArray (int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] makeVector(int[][] inputArray){
        int[] oneDimensionArray = new int[inputArray.length * inputArray[0].length];

        for (int i=0; i < oneDimensionArray.length;){
            for (int col = 0; col < inputArray[0].length; col++) {
                for (int row = 0; row < inputArray.length; row++) {
                    oneDimensionArray[i] = inputArray[row][col];
                    i++;
                }
            }
        }
        return oneDimensionArray;
    }

    public static int[] reverseArray(int[] inputArray){
        int[] resultArray = new int[inputArray.length];
        for (int i=0; i<inputArray.length;i++){
            resultArray[inputArray.length -1 -i] = inputArray[i];
        }
        return resultArray;
    }


}
