package Collections;

import java.util.*;


public class Set1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(2);
        set.add(5);
        Collections.addAll(set,3,7,1,0);
        System.out.println(set);
        int size = set.size();
        System.out.println("Size of the Collection : "+size);
        boolean val = set.contains(6);
        if(val){
            System.out.println("6 is present");
        }else{
            System.out.println("6 is not present");
        }
        set.clear();


    }
}
