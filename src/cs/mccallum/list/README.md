The List Interface
------------------

In Java the List Interface allows for the creation of elements stored in sequence.
Due to the fact that it is an interface, a list cannot be instantiated but
instead must be created using one of its concrete implementations such as:

- ArrayList
- LinkedList
- Vector
- Stack

_All of the above are part of the java.util package_


### List Methods
---

As with all interfaces, the implementers must provide an implementation
for each method defined by the Interface. The list of methods defined by
list can be found in the [JavaDocs](https://docs.oracle.com/javase/7/docs/api/java/util/List.html).

### ArrayList
---

Unlike a standard array which has a defined size that cannot be expanded,
an ArrayList allows for an modifiable amount of elements. An ArrayList
can be used like an array with slightly different syntax

- Setting a length: `int[] array = new int[3]` becomes `ArrayList<Integer> arrayList = new ArrayList<>(3);`
- Getting a length: `array.length` becomes `arrayList.size()`
- Getting an element: `array[0]` becomes `arrayList.get(0)`
- Setting an element: `array[0] = 2` becomes `arrayList.set(0, 2)`

Some methods that only ArrayList has that can be used:

- `remove(int n)` removes the element at index **n**
- `clear()` removed everything from the ArrayList
- `add(Object o)` add an object to the end of the ArrayList
- `add(int i, Object o)` add an object at index **i**
- `set(int i, Object o)` replace object at element **i** with **o**
- `toArray()` returns an Array with the elements of the ArrayList