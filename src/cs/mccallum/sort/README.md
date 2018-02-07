Search Algorithms
-----------------
[Sorting Algorithms Visually](https://www.toptal.com/developers/sorting-algorithms)
[15 Sorting Algorithms in 6 Minutes](https://www.youtube.com/watch?time_continue=132&v=kPRA0W1kECg)

### Bubble Sort
---
[Wiki](https://www.wikiwand.com/en/Bubble_sort)

One of the easier to implement sorting algorithms, Bubble Sort works by
"bubbling" the largest numbers to the end of the array. In order to accomplish
this the computer will look at two adjacent numbers in the array and if
the numbers are out of order they are swapped with one another.

Bubble sort's complexity is _O_(n²) which does make it quite slow compared
to the other sorting algorithms that can run in _O_(n log n) such as heapsort

Wiki:
> The only significant advantage that bubble sort has over most other implementations, even quicksort, but not insertion sort, is that the ability to detect that the list is sorted efficiently is built into the algorithm. When the list is already sorted (best-case), the complexity of bubble sort is only O(n).

### Insertion Sort
---
[Wiki](https://www.wikiwand.com/en/Insertion_sort)

Insertion sort is another _O_(n²) sorting algorithm that can sort in-place
by moving the arrays values until sorted. The algorithm is relatively simple
and follows the following procedure:

1. Compare the elements at A\[i] and A\[i+1] starting with i = 1
2. If A\[i] is greater than A\[i+1] then shift all numbers in the array
until A\[i] has been inserted into the correct space, else skip step
3. i = i + 1

![Visual](https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif)

By repeatedly shifting the values of the array in order to insert each value into its correct space,
insertion sort can run in-place which saves memory usage.