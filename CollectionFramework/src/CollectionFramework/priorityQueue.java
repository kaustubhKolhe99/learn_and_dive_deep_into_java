package CollectionFramework;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(45);
        numbers.add(99);
        numbers.add(1);
        System.out.println(numbers);
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());

        System.out.println(numbers);
        PriorityQueue<String> letters = new PriorityQueue<>();
        letters.add("x");
        letters.add("s");
        letters.add("a");
        System.out.println(letters);

        System.out.println(letters.poll());
        System.out.println(letters.poll());
        System.out.println(letters.poll());

        System.out.println(letters);



    }
}
record Customer(int id , String name , int priority) implements Comparable<Customer>{
    @Override
    public int compareTo(Customer o) {
        return Integer.compare(this.priority , o.priority);

    }


    public static void main(String[] args) {
        PriorityQueue<Customer> pq = new PriorityQueue<>();
        pq.add(new Customer(105 , "John" , 5));
        pq.add(new Customer(103 , "Tom Voldemort" , 3));
        pq.add(new Customer(120 , "Sandy the president" , 1));

        System.out.println(pq.peek());
        System.out.println(pq.peek());
        System.out.println(pq.peek()); // poll mutates the structure, element() and peek() don't
        System.out.println(pq);


    }
}

