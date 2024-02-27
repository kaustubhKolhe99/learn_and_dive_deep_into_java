package CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeAsStack {
    public static void main(String[] args) {
        //in stack we insert from the head and remove from the head
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.push("book1");
        arrayDeque.push("book2");
        arrayDeque.offerFirst("book3"); // offer() adds element to last unlike addfirst
        arrayDeque.addFirst("Book4");

        String element  = arrayDeque.peek();
        System.out.println(element);



         System.out.println(arrayDeque);
    }
}
