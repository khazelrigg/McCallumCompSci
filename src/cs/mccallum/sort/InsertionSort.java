package cs.mccallum.sort;

public class InsertionSort implements Sorter{

    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int left = array[j - 1];
                array[j - 1] = array[j];
                array[j] = left;
            }
        }
        return array;
    }

    @Override
    public String getName() {
        return "Insertion Sort";
    }
}
