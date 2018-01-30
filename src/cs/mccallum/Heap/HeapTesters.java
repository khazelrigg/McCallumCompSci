package cs.mccallum.Heap;

public class HeapTesters {
    public static void main(String[] args) {
        int[] testArray = {6, 5, 3, 1, 8, 7, 2, 4};
        Heap myHeap = new Heap(testArray);
        System.out.println("Heap: \t\t" + myHeap);
        myHeap.insert(6);
        System.out.println("Inserted 6:\t" + myHeap);
        System.out.println("Extracted: \t" + myHeap.extractMax() + " -> " + myHeap);
        System.out.println("FindMax: \t" + myHeap.findMax());
        myHeap.replace(3);
        System.out.println("Replaced: 3\t" + myHeap);
        myHeap.deleteMax();
        System.out.println("Deleted: \t" + myHeap);


        Heap tester = new Heap();
        tester.insert(1);
        tester.insert(2);
        tester.insert(20);
        tester.insert(9);
        System.out.println(tester);


        int[] otherArray = {20, 34, 56, 3, 7};
        Heap merger = new Heap();
        merger.merge(testArray, otherArray);
        System.out.println("Merged: \t" + merger);
    }

}
