import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamAPI2 {
    static List<Integer> intList = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

    HashMap<Integer , String> empMap = new HashMap<>(Map.of(1,"John" , 2 ,"Tom"));
    String[] strArray = {"first" , "second" , "third" , "fourth"};

    public static void main(String[] args) {
        OptionalInt min =IntStream.of(1,2,3).min();
        OptionalLong max =LongStream.of(1,2,3).max();

        OptionalDouble avg = DoubleStream.of(1,2,3).average();
        Optional<Integer> listMin = intList.stream().min(Comparator.naturalOrder());
        System.out.println(min +" " + max+ " " + avg);
        System.out.println(listMin);

        listMin.isEmpty();
        listMin.isPresent();
        listMin.get();
        listMin.orElse(0);
        Optional<String> optionalS = Optional.of("John");
        Optional<String> optionalS1 = Optional.ofNullable(null);
        System.out.println(optionalS1.orElse("no value"));
        System.out.println(optionalS.get());

        intList.stream().forEach(System.out::println);

        System.out.println(intList.stream().findAny());
        System.out.println(intList.parallelStream().findAny());
        System.out.println(intList.parallelStream().findFirst());
        System.out.println(intList.stream().allMatch(e ->e>1));
        System.out.println(intList.stream().anyMatch(e ->e>1));
        System.out.println(intList.stream().noneMatch(e ->e>1));






    }
}
