package Collections;

import java.util.*;



public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Kushal");
        list.add("Saniya");
        list.add("Aalok");
        list.add("Shlok");
        list.add("Tiwari");

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
