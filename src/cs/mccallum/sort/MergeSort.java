package cs.mccallum.sort;

public class MergeSort implements Sorter {

    int[] numbers;
    int[] worker;
    int n;

    @Override
    public int[] sort(int[] array) {
        numbers = array;
        n = array.length;
        worker = new int[n];

        mergeSort(0, n - 1);

        return numbers;
    }

    private void mergeSort(int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            merge(start, mid, end);
        }
    }

    private void merge(int start, int mid, int end) {
        for (int i = start; i <= end; i++) {
            worker[i] = numbers[i];
        }

        int i = start;
        int k = start;
        int j = mid + 1;

        while (i <= mid && j <= end) {
            if (worker[i] <= worker[j]) {
                numbers[k] = worker[i];
                i++;
            } else {
                numbers[k] = worker[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            numbers[k] = worker[i];
            k++;
            i++;
        }

    }

    @Override
    public String getName() {
        return "Merge Sort";
    }
}
