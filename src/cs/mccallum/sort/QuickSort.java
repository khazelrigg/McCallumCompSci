package cs.mccallum.sort;

public class QuickSort implements Sorter {

    int[] a;
    int n;

    @Override
    public int[] sort(int[] array) {
        a = array;
        n = array.length;
       quicksort(0, n - 1);
       return array;
    }

    void quicksort(int low, int high) {
        if (low < high) {
            int p = partition(a, low, high);
            quicksort(low, p - 1);
            quicksort(p + 1, high);
        }
    }

    // Lomuto partition scheme
    int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low;
        for (int j = low; j < high - 1; j++) {
            if (a[j] < pivot) {
                i++;
                int left = a[i];
                a[i] = a[j];
                a[j] = left;
            }
        }
        int left = a[i + 1];
        a[i + 1] = a[high];
        a[high] = left;

        return i + 1;
    }

    @Override
    public String getName() {
        return "Quick Sort";
    }
}
