package cs.mccallum.sort;

import java.util.Arrays;

public class SortTester {

    public static void main(String[] args) {
        int[] sortMe = {4, 2, 6, 12, 99, 49, 50, 34, 212, 45, 90};
        System.out.println("Original: " + Arrays.toString(sortMe) + " | IsSorted: " + isSorted(sortMe));

        int[] bubbled = BubbleSort.bubbleSort(sortMe);
        System.out.println("Bubble Sorted: " + Arrays.toString(bubbled) + " | IsSorted: " + isSorted(bubbled));
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
