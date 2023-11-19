package CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeAsQueue {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer("customer1");
        arrayDeque.offerLast("customer2");
        arrayDeque.addLast("customer3");
        arrayDeque.offer("customer4");

        String element = arrayDeque.getFirst();
        System.out.println(element);
        String element2 = arrayDeque.removeFirst();
        System.out.println(element2);
        System.out.println(arrayDeque);
    }
}
