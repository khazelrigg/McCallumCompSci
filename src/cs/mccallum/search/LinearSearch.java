package cs.mccallum.search;

public class LinearSearch {

    public static void main (String[] args) {
        //                 0  1  2  3  4   5   6   7   8   9   10  11  12  13  14  15
        int[] testArray = {2, 4, 5, 8, 12, 32, 33, 56, 67, 73, 80, 85, 87, 90, 92, 100};
        int goal = 73;
        int index = linearSearch(testArray, goal);
        System.out.println("Goal: " + goal + " Index: " + index + " testArray[" + index + "] = " + testArray[index]);
    }


    /**
     * Linear search algorithm which returns the index of goal
     * @param array integer array to search
     * @param goal number to search for
     * @return index of goal or -1 if goal is not in array
     */
    private static int linearSearch(int[] array, int goal) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == goal) {
                return i;
            }
        }
        return -1;
    }
}
