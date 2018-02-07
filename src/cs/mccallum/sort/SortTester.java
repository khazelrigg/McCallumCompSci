package cs.mccallum.sort;

import java.util.*;

public class SortTester {

    public static void main(String[] args) {
        Sorter[] sorters = {new Shellsort(), new MergeSort(), new QuickSort()};
        double[] doubleTimes = new double[sorters.length];
        int runs = 10;
        int arraySize = 100000;

        System.out.println("Average sorting time of random " + arraySize + " element array");

        for (int s = 0; s < sorters.length; s++) {
            Sorter sorter = sorters[s];

            for (int i = 0; i < runs; i++) {
                int[] sortMe = getShuffledInts(arraySize);
                // Timer to record times
                long startTime = System.nanoTime();
                System.out.println(isSorted(sorter.sort(sortMe)));
                long endTime = System.nanoTime();
                double milli = (endTime - startTime) / 1000000.0;
                doubleTimes[s] = doubleTimes[s] + milli;
                //Add time to total
            }
            System.out.println(sorter.getName() + ": " + doubleTimes[s] / runs + " ms.");
        }

    }


    private static int[] getShuffledInts(int size) {
        ArrayList<Integer> rand = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            rand.add(i);
        }
        Collections.shuffle(rand);

        return convertIntegers(rand);
    }

    private static int[] convertIntegers(ArrayList<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = iterator.next();
        }
        return ret;
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
