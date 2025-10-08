package Collections;

import java.util.Iterator;
import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        Vector<String> vc = new Vector<>();

        vc.add("Sumit");
        vc.add("Dhyan");
        vc.add("Pankti");
        vc.add("Vishesh");

        Iterator<String> itr = vc.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
