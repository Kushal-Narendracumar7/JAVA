package Collections;
import java.util.*;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();

        ls.add("Apple");
        ls.add("Mango");
        ls.add("Orange");
        ls.add("Pineapple");

        Iterator<String> itr = ls.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
