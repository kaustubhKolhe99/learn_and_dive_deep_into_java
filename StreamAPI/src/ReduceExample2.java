import java.util.ArrayList;
import java.util.List;

public class ReduceExample2 {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>(List.of("Java" , "is", "awesome" ));
        String result = list.stream().reduce("", (acc , w) -> acc+ " "+w);
        System.out.println(result);

    }
}
