package CollectionFramework.HashMapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPosition {
    public static void main(String[] args) {
        String sentence = "Hello Hello Hello Java Hello Java";
        String[] words = sentence.split(" ");

        Map<String, List<Integer>> indexes = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(indexes.containsKey(word)){
                List<Integer> currList = indexes.get(word);
                currList.add(i);
            }else {
                indexes.put(word , new ArrayList<>(List.of(i)));
            }

        }
        System.out.println(indexes);
    }
}
