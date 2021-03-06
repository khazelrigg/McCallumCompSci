package cs.mccallum.sort;

class BubbleSort implements Sorter {


    /*
    Bubble Sort looks at two values in an array and checks if the left value is greater than the right. In the case that
    it is the values are swapped which "bubbles" the greater numbers to the right of the array. The array is sorted when
    no more swaps are performed. The complexity of BubbleSort is O(n²)
     */
    public int[] sort(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                int left = array[i - 1];
                if (left > array[i]) {
                    array[i - 1] = array[i];
                    array[i] = left;
                    swapped = true;
                }
            }
        } while (swapped);
        return array;
    }

    @Override
    public String getName() {
        return "Bubble Sort";
    }

}
