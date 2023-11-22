import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccumulatorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("java", "is" , "awesome"));
        String joinedString = list.stream().collect(Collectors.joining(" ",">>>" ,"<<<"));
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(s1-> s1 , s1->s1.length()));
        List<Integer> list1 = Stream.of(1,2,3).collect(Collectors.toList());



        System.out.println(joinedString);

    }
}
