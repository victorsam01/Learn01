package Learning;

import java.util.Iterator;
import java.util.LinkedList;

public class MyVector {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        LinkedList l1 = new LinkedList(l);
        l1.add(60);
        l1.addFirst('a');
        l1.addLast('z');
        System.out.println(l1);
        l1.removeFirst();
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
    }
}
