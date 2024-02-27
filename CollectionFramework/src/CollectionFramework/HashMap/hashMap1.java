package CollectionFramework.HashMap;

import java.util.HashMap;
import java.util.Map;

public class hashMap1 {
    public static void main(String[] args) {
        Map<Integer , String> students = new HashMap<>();

        //students.put(1,"John");
        students.put(2,"tom"); //added entry
        students.put(2, "Tom Doe"); // updated entry


        Map<Integer , String> otherMap = new HashMap<>(Map.of(2,"Samantha" , 4 , "Olivia"));

        students.putAll(otherMap);
        students.putIfAbsent(1,"Ryan"); //updates only if the key is absent
        students.computeIfAbsent(5 , k->{
          return "Oggy";
        } );

        students.computeIfPresent(1, (k,v) -> v.toUpperCase() +"!");
        students.compute(2 , (k , v) -> v.toUpperCase()+"!");
        students.compute(3 , (k , v) -> {
            if(students.containsKey(k)){
                return v.toUpperCase() +"!" ;

            }
            return "Jonny";
        });
        System.out.println(students);





    }
}
