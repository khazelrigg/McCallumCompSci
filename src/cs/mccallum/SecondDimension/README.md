Multi Dimensional Arrays
------------------------

A multi dimensional array is simply a 1D array which contains references to 1D arrays of the same type.
For simplicity these examples only use two dimensions but the following is consistent as the number of dimensions increases.

In Java the arrays discussed so far are only in one dimension and are created as follows:

    int[] array = new int[3];

In many programming languages (such as Java) 2D arrays are created by using a single 1D array which holds references to other 1D arrays.
When creating and accessing a 2D array in Java, the bracket notation used for a 1D array is used with two values.
To create a 2D array with two 1D arrays that have a size of 4.

    int[][] table = new int[2][4];

The first 1D array can be accessed by using a single bracket:

    int[] firstArray = table[0];

or a 1D array and one of its values can be accessed using two brackets:

    int test = table[0][1];

---
Due to the fact that a 2D array contains references to 1D arrays, changes made to a 1D array result in changes to the original 2D array.

    int[][] testTable = new int[2][4];
    int[] row2 = testTable[1];
    row2[3] = 2;

After setting the second 2D array's 4th value to 2, the 2D array contains those changes

    System.out.println(testTable[1][3] == 2); //returns true

Another interesting feature of using references to other arrays is that in Java it is possible to create a 2D array that contains 1D arrays of varying lengths.
To do this create a 2D array without specifying the lengths of the 1D arrays:

    int[][] jagged = new int[2][]; //No value specified in second bracket
    jagged[0] = new int[6];
    jagged[1] = new int[2];

---
## Use Cases

A 2D array can be thought of as a table where you access contents through a row and column

- Implementing games using a simple grid such as battleship or chess
- Holding information better represented as a table



---
#### Links with more info
- [Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- [Wikipedia](https://en.wikipedia.org/wiki/Array_data_type#Multi-dimensional_arrays)
- [Carnegie Mellon intro to CS](https://www.cs.cmu.edu/~mrmiller/15-110/Handouts/arrays2D.pdf)