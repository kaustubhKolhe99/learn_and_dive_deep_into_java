package CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer , String> students = new LinkedHashMap<>();
        students.put(101, "John" );
        students.put(102 , "Sandy" );
        students.putIfAbsent(101, "Tom");
        students.computeIfAbsent(103 , k->"Ryan");
        students.computeIfPresent(101 , (k , v) -> v.toUpperCase()+"!");

        System.out.println(students.get(101));
        System.out.println(students.keySet());
        System.out.println(students.values());
        for(Map.Entry<Integer , String> entry : students.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

        System.out.println(students);

    }
}
class LRUExample{
    public static void main(String[] args) {
        LinkedHashMap<Integer, String > students =
                new LinkedHashMap<>(5,0.75f, true){
                    @Override
                    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                        return size()>5;
                    }
                };
        populateAndPrint(students);
        for (int i = 0; i < 10; i++) students.get(6);
        for (int i = 0; i < 10; i++) students.get(5);


        students.forEach((k,v) ->System.out.println(k +" -> "+ v));



    }

    private static void populateAndPrint(LinkedHashMap<Integer, String> students) {
        students.put(1, "one");
        students.put(2, "two");
        students.put(3, "three");
        students.put(4, "four");
        students.put(5, "five");
        students.put(6, "six");
        students.put(7, "seven");
        students.put(8, "eight");
        students.put(9, "nine");


    }
}