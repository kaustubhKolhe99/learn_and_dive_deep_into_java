package CollectionFramework.HashMap;

import java.util.*;

public class hashMap2 {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>(Map.of(1 , "John" , 2 , "Olivia"));
        String name = students.get(3); //get() method return the value of the key, if key does not exist then returns the value null
        name = students.getOrDefault(3  , "no such student");
        System.out.println("name:" + name);

        Set<Integer> myKeys = students.keySet();
        myKeys.forEach(k-> System.out.println("key: " + k));

        Collection<String> myValue = students.values();
        myValue.forEach(v -> System.out.println("value: " + v ));

        for (Map.Entry<Integer , String> entry: students.entrySet()){
            System.out.println("key--> " + entry.getKey()+ " ,value --> " + entry.getValue());


        }

        students.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);

        });
        System.out.println(students);
        students.replace(1 , "Tom");
        students.replace(3 , "Tom");
        students.replaceAll((k,v)-> v.toUpperCase()+"!");

        students.merge(1 ,"New John" , (oldValue , newValue)->{
            System.out.println("Old value:" + oldValue);
            System.out.println("New value:" + newValue);
            return newValue;


        });
        students.remove(2);
        students.size();
        students.containsKey(1);
        students.containsValue("tom");
        students.isEmpty();
//        students.clear(); // removes all elements from the map










        System.out.println(students);
    }
}
