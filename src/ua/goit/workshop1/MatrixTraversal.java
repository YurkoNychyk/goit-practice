package ua.goit.workshop1;


/**
 * Created by home on 30.04.2016.
 */
public class MatrixTraversal {
    public static void main(String[] args) {
        int[][] inputArray3 = new int[][]{
                {1,2},
                {3,4}
        };
        int[] outputArray3 = print(inputArray3);
        MatrixSnakeTraversal.printArray(outputArray3);

        int[][] inputArray = new int[][] {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[] outputArray = print(inputArray);
        MatrixSnakeTraversal.printArray(outputArray);
        int[][] inputArray2 = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[] outputArray2 = print(inputArray2);
        MatrixSnakeTraversal.printArray(outputArray2);


    }


    public static int[] print(int[][] input) {
        int lastRow = input.length;
        int lastColumn = input[0].length;

        int[] vector = new int[lastColumn*lastRow];
        int i=0;
        int row = 0;
        int col = 0;

        while (true){

            lastRow--;
            lastColumn--;

            while (col <=lastColumn && i < vector.length){
                vector[i] = input[row][col];
                col++;
                i++;
            }
            col--;
            row++;

            if (i >= vector.length) {
                break;
            }

            while (row <= lastRow && i < vector.length){
                vector[i] = input[row][col];
                row++;
                i++;
            }
            row--;
            col--;

            if (i >= vector.length) {
                break;
            }

            while (col>=0 && i < vector.length){
                vector[i] = input[row][col];
                col--;
                i++;
            }
            col++;
            row--;

            if (i >= vector.length) {
                break;
            }

            while (row >= input.length - lastRow && i < vector.length){
                vector[i] = input[row][col];
                row--;
                i++;
            }
            row++;
            col++;

            if (i >= vector.length) {
                break;
            }
        }

        return vector;
    }
}
