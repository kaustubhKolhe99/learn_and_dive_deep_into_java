package CollectionFramework;

import java.util.Queue;

public class LinkedList {
    public static void main(String[] args) {
        Queue<String> linkedlist = new java.util.LinkedList<>();
        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D"); //offer adds elements at the back

        String element2 = linkedlist.peek(); //peek returns the element having head without mutating the list
        System.out.println(element2);

        String element = linkedlist.poll(); // poll() gets the first element(element having head) of the structure, here A is first in and hence first out
        //now B is head
        System.out.println(element);

        System.out.println(linkedlist);
        Queue<String> linkedList2 = new java.util.LinkedList<>();
//        linkedList2.remove(); // will cause exception
        linkedList2.poll(); // wont throw error

    }
}
