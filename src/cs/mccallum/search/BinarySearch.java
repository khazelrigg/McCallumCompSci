package cs.mccallum.search;

public class BinarySearch {
    //https://en.wikipedia.org/wiki/Binary_search_algorithm

    public static void main(String[] args) {
        //                 0  1  2  3  4   5   6   7   8   9   10  11  12  13  14  15
        int[] testArray = {2, 4, 5, 8, 12, 32, 33, 56, 67, 73, 80, 85, 87, 90, 92, 100};
        int index = binarySearch(testArray, 56);
        System.out.println(index);

        int numNotInArray = binarySearch(testArray, 102);
        System.out.println(numNotInArray);

    }

    /**
     * Returns the index where the goal is located within array
     * @param array Array to search through
     * @param goal int to be search for
     * @return the index of goal in array, -1 if not in array
     */
    private static int binarySearch(int[] array, int goal) {
        int left = 0;
        int right = array.length - 1;

        int middle;
        while (true) {
            // Exception case indicating the array does not contain the target
            if (left > right) {
                return -1;
            }

            // Find middle element
            middle = (int) Math.floor((left + right) / 2.0);

            if (array[middle] == goal) {
                return middle;
            }

            if (array[middle] < goal) {
                left = middle + 1;
                continue;
            }

            if (array[middle] > goal) {
                right = middle - 1;
            }
        }

    }

}
