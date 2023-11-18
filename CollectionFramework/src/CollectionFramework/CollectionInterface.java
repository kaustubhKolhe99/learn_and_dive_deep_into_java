package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionInterface {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        Collection<Integer> collection2 = List.of(2,3,4,5,6);
        Collection<Integer> collection3 = new ArrayList<>(){ {
            add(4);
            add(5);
            add(6);
        }};



        System.out.println(collection);
        System.out.println(collection2);
        System.out.println(collection3);
        collection.addAll(collection2);
        System.out.println(collection);
        collection.remove(1);  // remove by value
        System.out.println(collection);
        collection.removeAll(collection3);
        System.out.println(collection);

        collection3.removeIf(c -> c%2 ==0);
        System.out.println(collection3);
//        collection2.add(4);
//        collection2.add(5);
//        collection2.add(7);
//        collection2.add(9);
//        collection3.add(4);
//        collection3.add(7);
//        collection3.add(8);
//        collection2.retainAll(collection3); // remove everything in collection2 except elements in collection3
//        System.out.println(collection2);

        System.out.println(collection.contains(3));
        System.out.println(collection.containsAll(collection2));

        System.out.println(collection.isEmpty());
        System.out.println(collection.size());

        Iterator<Integer> iterator = collection2.iterator();
        while (iterator.hasNext()) {
            Integer currValue = iterator.next();
            System.out.println(currValue);


        }
        System.out.println("-----------------------------------------");
        collection2.forEach(c -> System.out.println(c));

























    }
}
