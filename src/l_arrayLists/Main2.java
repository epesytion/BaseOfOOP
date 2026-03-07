package l_arrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {
    static void main(String[] args) {
        //Sorting
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(9);
        nums.add(-8);
        nums.add(-4);
        nums.add(3);
        System.out.println(nums);

        //To sort elements in arraylist, we use 'Collections' framework
        Collections.sort(nums);
        System.out.println(nums);
    }


}
