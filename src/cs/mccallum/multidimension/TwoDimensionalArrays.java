package cs.mccallum.multidimension;
/*
CREATED: 1/23/18
BY: Kameron Hazelrigg

Usage of two dimensional arrays of integers
 */

import java.util.Arrays;

public class TwoDimensionalArrays {

    public static void main(String[] args) {
        // Creating a 2D array
        System.out.println("Basic 2D Array");
        int[][] testTable = new int[2][4];
        testTable[1][2] = 9;
        int[] row2 = testTable[1];
        row2[3] = 2;

        System.out.println("row2 = " + Arrays.toString(row2) +
                "\nArrays.deepToString(); " + Arrays.deepToString(testTable) +
                "\ntestTable[1][3] == 2; " + (testTable[1][3] == 2));

        System.out.println("\nJagged Array (2D array of varying size)");
        int[][] jagged = new int[2][];
        jagged[0] = new int[6];
        jagged[1] = new int[2];
        System.out.println(Arrays.deepToString(jagged));

        int[][] table = createMultiplicationTable(10);
        // Use Arrays.deep* for multi dimensional arrays
        printMultiplicationTable(table);
        System.out.println("Arrays.deepToString();\n" + Arrays.deepToString(table));
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
        System.out.println("\nMultiplication table | " + table.length + "x" + table.length);

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table.length; col++) {
                System.out.printf("%4d", table[row][col]);
            }
            System.out.println();
        }

        /*
        The same thing using a foreach loop
        for (int[] row : table) {
            for (int number : row) {
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
        */


    }

}
