package Learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class MyCollections {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        System.out.println(h.add(1));
        System.out.println(h.add(2));
        System.out.println(h.add(3));
        System.out.println(h.add(40));
        System.out.println(h);  //HashSet doesnot allows duplicate values

        TreeSet t = new TreeSet();
        t.add(20);
        t.add(10);
        t.add(2);
        t.add(2);
        System.out.println(t); //TreeSet also doesnot allows duplicate values but the sorting will be done.
        h.addAll(t);
        System.out.println(h);
        h.removeAll(t);
        System.out.println(h);
        h.remove(3);
        System.out.println(h);

        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        System.out.println(a);
        a.remove(1);
        System.out.println(a);
    }
}
