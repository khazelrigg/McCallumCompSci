package cs.mccallum.sort;

public class Shellsort implements Sorter{

    public int[] sort(int[] array) {
        //Marcin Ciura's gap sequence
        int[] gaps = {1750, 701, 301, 132, 57, 23, 10, 4, 1};

        for (int gap : gaps) {
            for (int i = gap; i < array.length; i++) {
                int temp = array[i];
                int j = i;
                for (; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
        return array;
    }

    @Override
    public String getName() {
        return "Shell sort";
    }
}
