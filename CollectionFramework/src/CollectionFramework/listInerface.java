package CollectionFramework;

import java.util.*;
import java.util.ArrayList;

public class listInerface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");

        list.add(0,"new element");

        List<String> list1 = new ArrayList<>(){{
            add("one");
            add("two");
        }};
        list.addAll(1,list1);
        System.out.println( list.get(0));
        list.add(0,"second");

        System.out.println(list.indexOf("second"));
        System.out.println(list.lastIndexOf("second"));

        list.replaceAll(String::toUpperCase);
        List<String> sublist = list.subList(0,3);
        System.out.println(sublist);

        list.set(0,"zero element");
        list.sort(String::compareTo);

        ListIterator<String> listIterator = list.listIterator(5);
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }



        System.out.println(list);

    }
}
