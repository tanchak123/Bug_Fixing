package main.java.com.bugs.null_pointer_exceptions;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
         //implements yours output according to the next style
        int count = 1;
        for(int[] matrix_ : matrix){
            int [] matrixResult = new int[count];
            for (int i = 0; i < count; i++) {
                matrixResult[i] = matrix_[0];
            }
                System.out.println(Arrays.toString(matrixResult));
            count++;
        }

    }
}
/*
[1]
[1, 1]
[1, 1, 1]
[1, 1, 1, 1]
[1, 1, 1, 1, 1]
 */