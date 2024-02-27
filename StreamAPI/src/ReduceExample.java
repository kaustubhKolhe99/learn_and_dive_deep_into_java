import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4));
        Optional<Integer> sum =list.stream().reduce((acc , n)->{
            System.out.println("acc:"+acc + " n:" + n);
            return acc*n;
        });
        System.out.println(sum);
        Integer result =list.stream().reduce(10,Integer::sum);
        System.out.println(result);

    }
}
