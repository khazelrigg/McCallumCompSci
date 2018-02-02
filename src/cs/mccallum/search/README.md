Searching Algorithms
--------------------

Unlike humans, computers cannot look at all of the elements in an array
to find where a number is contained. Search algorithms are designed to
tell a computer how to look at a set of data and find where a specific
item is located.

---
### Linear Search

The simplest search algorithm to implement is linear search which looks
through every item in the set in order to find a number. In the worst case,
linear search will run in linear time **_O_(n)**, meaning it will have to look
through every single item in a set. Linear time which is represented as
**_O_(n)** where **n** is the size of the set, means that as the size of
the set increases the max number of steps will increase linearly.

_Unlike binary search linear search does not require the set to be sorted._

A simple linear search method which returns the index of the goal or -1 if it is not in the array:

        private static int linearSearch(int[] array, int goal) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == goal) {
                    return i;
                }
            }
            return -1;
        }

---
### Binary Search (or Divide and Conquer)

In binary search a set is repeatedly split in half reducing the number of
elements that the computer has to look at. To use binary search the set
must be sorted. Performance wise, binary search is typically much more
efficient than linear search as it grows in logarithmic time expressed in
Big O as **_O_(log n)**

From [Wikipedia](https://en.wikipedia.org/wiki/Binary_search#Algorithm):

> Binary search works on sorted arrays. Binary search begins by comparing the middle element of the array with the target value. If the target value matches the middle element, its position in the array is returned. If the target value is less than or greater than the middle element, the search continues in the lower or upper half of the array, respectively, eliminating the other half from consideration.

An example implementation of binary search can be found in
[BinarySearch.java](https://github.com/khazelrigg/McCallumCompSci/blob/master/src/cs/mccallum/search/BinarySearch.java)