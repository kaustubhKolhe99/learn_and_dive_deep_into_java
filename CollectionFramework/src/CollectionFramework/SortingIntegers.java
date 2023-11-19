package CollectionFramework;

import java.util.*;
import java.util.ArrayList;

public class SortingIntegers {
    public static void main(String[] args) {
        Integer[] arr = {2,5,8,6,7,4};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Before Sorting:" + list);

        list.sort(Comparator.naturalOrder());
        System.out.println();
        list.sort(Comparator.reverseOrder());
        list.add(null);
        list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println("After Sorting: " + list);



    }

}
class SortingString {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Byyyyy" , "Dww" , "Cxxxx" , "az"));
        System.out.println("Before sorting" + list);

        list.sort(Comparator.naturalOrder());
        list.sort(String.CASE_INSENSITIVE_ORDER);

        Comparator<String> lengthcomparator = Comparator.comparingInt(String::length);
        Comparator<String> lengthcomparator2 = (s1 , s2) -> Integer.compare(s1.length() , s2.length());
        list.sort(lengthcomparator2);

        Comparator<String> sortBySecondCharComparator = (s1 , s2 ) -> Integer.compare(s1.charAt(1) , s2.charAt(1));
        list.sort(sortBySecondCharComparator);





        System.out.println("After sorting" + list);




    }
}
class UsingCollection{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Byyyyy" , "Dww" , "Cxxxx" , "az"));
        System.out.println("Before sorting"+list);

        Collections.sort(list);
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);

        Collections.sort(list , Comparator.comparingInt(String::length));
        Collections.sort(list , Collections.reverseOrder());

        Collections.sort(list , (s1 , s2 ) -> Integer.compare(s2.charAt(1) , s1.charAt(1)));










        System.out.println("After sorting"+list);
    }
}

