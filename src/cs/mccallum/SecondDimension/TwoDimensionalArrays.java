package cs.mccallum.SecondDimension;
/*
CREATED: 1/23/18
BY: Kameron Hazelrigg

Usage of two dimensional arrays of integers
 */

import java.util.Arrays;

public class TwoDimensionalArrays {

    public static void main(String[] args) {
        // Creating a 2D array
        int[][] testTable = new int[2][4];
        testTable[1][2] = 9;
        int[] row2 = testTable[1];
        row2[3] = 2;
        System.out.println(Arrays.toString(row2));
        System.out.println(Arrays.deepToString(testTable));
        System.out.println(testTable[1][3] == 2);

        int[][] jagged = new int[2][];
        jagged[0] = new int[6];
        jagged[1] = new int[2];

        //int[][] table = createMultiplicationTable(10);
        //System.out.println(Arrays.deepToString(table)); //Arrays.deep___ is used for 2D+ arrays
        //printMultiplicationTable(table);
    }

    private static int[][] createMultiplicationTable(int size) {
        int[][] multiplicationTable = new int[size][size ];

        for (int row = 1; row < size + 1; row++) {
            for (int col = 1; col < size + 1; col++) {
                multiplicationTable[row - 1][col - 1] = row * col;
            }
        }

        return multiplicationTable;
    }

    private static void printMultiplicationTable(int[][] table) {
        System.out.println("Multiplication table | " + table.length + "x" + table.length);

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table.length; col++) {
                System.out.printf("%4d", table[row][col]);
            }
            System.out.println();
        }

        /*
        for (int[] row : table) {
            for (int number : row) {
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
        */


    }

}
