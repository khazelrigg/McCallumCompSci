package cs.mccallum.sort;

import java.util.Arrays;

public class SortTester {

    public static void main(String[] args) {
        int[] sortMe = {4, 2, 6, 12, 99, 49, 50, 34, 212, 45, 90};

        Sorter[] sorters = {new BubbleSort(), new InsertionSort()};

        for (Sorter sorter : sorters) {
            int[] sortedArray = sorter.sort(sortMe);
            System.out.println(sorter.getName() + ":\t" + Arrays.toString(sortedArray) + "\tSorted: " + isSorted(sortedArray));
        }

    }

    private static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }


}
