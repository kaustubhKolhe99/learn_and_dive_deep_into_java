package CollectionFramework;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(99);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(1,555);
        numbers.add(null);
        System.out.println(numbers);
    }
}
