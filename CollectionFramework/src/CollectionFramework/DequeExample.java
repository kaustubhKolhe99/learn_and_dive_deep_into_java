package CollectionFramework;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> linkedList = new LinkedList<>();
        linkedList.push("Book1");
        linkedList.push("Book2");
        linkedList.push("Book3");
        System.out.println(linkedList);

        String popedElement = linkedList.pop();
        System.out.println(popedElement);

        linkedList.addFirst("first");
        linkedList.addLast("last");

        linkedList.pollFirst();//removes the first element\
        linkedList.pollLast(); // removes the last element



        System.out.println(linkedList);
    }
}
