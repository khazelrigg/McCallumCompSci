package cs.mccallum.Heap;

import java.util.ArrayList;
import java.util.Arrays;

public class Heap {
    //https://en.wikipedia.org/wiki/Heap_(data_structure)
    private ArrayList<Integer> binaryHeap = new ArrayList<>();

    Heap(int[] array) {
        buildMaxHeap(array);
    }

    Heap() {}

    //William's method O(n log n)
    private void heapify(int[] array) {
        for (int i : array) {
            insert(i);
        }
    }

    // Floyd's method O(n)
    void buildMaxHeap(int[] array) {
        // Arbitrarily fill tree
        Arrays.stream(array).forEach(binaryHeap::add);
        for (int i = (int) Math.floor(array.length / 2.0); i >= 0; i--) {
            maxHeapify(i);
        }
    }


    void insert(int i) {
        binaryHeap.add(i);

        int parentIndex;
        int nodeIndex = binaryHeap.size() - 1;

        while (true) {
            parentIndex = getParent(nodeIndex);

            if (parentIndex < 0 || binaryHeap.get(parentIndex) > binaryHeap.get(nodeIndex)) {
                break;
            }

            int parentValue = binaryHeap.get(parentIndex);
            int nodeValue = binaryHeap.get(nodeIndex);
            // Swap element with parent
            binaryHeap.set(parentIndex, nodeValue);
            binaryHeap.set(nodeIndex, parentValue);
            nodeIndex = parentIndex;
        }
    }

    int extractMax() {
        int value = binaryHeap.get(0);
        deleteMax();
        return value;
    }

    void deleteMax() {
        binaryHeap.set(0, binaryHeap.get(binaryHeap.size() - 1));
        binaryHeap.remove(binaryHeap.size() - 1);
        maxHeapify(0);
    }

    private void maxHeapify(int i) {
        int length = binaryHeap.size();
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int greaterChild = i;

        if (left < length && binaryHeap.get(left) > binaryHeap.get(greaterChild)) {
            greaterChild = left;
        }
        if (right < length && binaryHeap.get(right) > binaryHeap.get(greaterChild)){
            greaterChild = right;
        }

        if (greaterChild != i) {
            int nodevalue = binaryHeap.get(i);
            binaryHeap.set(i, binaryHeap.get(greaterChild));
            binaryHeap.set(greaterChild, nodevalue);
            maxHeapify(greaterChild);
        }
    }

    static int getParent(int node) {
        return (int) Math.floor((node - 1) / 2.0);

    }

    int findMax() {
        return binaryHeap.get(0);
    }

    void replace(int node) {
        binaryHeap.set(0, node);
        maxHeapify(0);
    }

    int size() {
        return binaryHeap.size();
    }

    boolean isEmpty() {
        return binaryHeap.isEmpty();
    }

    static int[] getChildren(int node) {
        return new int[]{(2 * node) + 1, (2 * node) + 2};
    }

    static int getLastNode(int layer) {
        return (int) (Math.pow(2.0, layer + 1.0) - 2);
    }

    void merge(int[] array1, int[] array2) {
        int[] combines = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++ ){
            combines[i] = array1[i];
        }

        for (int j = 0; j < array2.length; j++) {
            combines[j + array1.length] = array2[j];
        }

        buildMaxHeap(combines);
    }

    public String toString() {
        return binaryHeap.toString();
    }

}
