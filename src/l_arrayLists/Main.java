package l_arrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static void main(String[] args) {
        //ArrayList - resizeable array that stores objects (autoboxing)
        //simple arrays are fixed in size, but arraylists can change

        //need to import ArrayList actually

        //Syntax: ArrayList<dataType> list = new ArrayList<>();
        //You can use wrapper classes to store primitives (Integer e.g.)
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(6554);
        list.add(-88);
        System.out.println(list); //You can get the list easily by just passing to sout the name or arraylist.
        //If you do it with simple arrays, you get sth confusing
        int[] arr = {1, 2, 3};
        System.out.println(arr);


        //Let's store shop list:
        ArrayList<String> groceries = new ArrayList<>();
        groceries.add("apple");
        groceries.add("orange");
        groceries.add("pear");
        System.out.println(groceries);

        //Removing elements:
        groceries.remove("apple");
        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);

        //set, get
        groceries.remove("apple");
        groceries.set(0, "apple");
        System.out.println(groceries);
        System.out.println("The object with 0 index = " + groceries.get(0));


    }
}
