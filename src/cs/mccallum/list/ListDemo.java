package cs.mccallum.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main (String[] args) {
        List list = new ArrayList<Integer>();
        list.add(20);
        list.add(10);
        list.add(15);
        list.remove(1);
        System.out.println("list: " +  list);

        ArrayList<Integer> listTwo = new ArrayList<>(3);
        listTwo.add(9);
        listTwo.add(20);
        listTwo.add(9999);
        System.out.println("listTwo: " + listTwo);

        Object[] objects = listTwo.toArray();
        System.out.println("objects: " + Arrays.toString(objects));
    }
}
