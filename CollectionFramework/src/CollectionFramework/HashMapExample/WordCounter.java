package CollectionFramework.HashMapExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String sentence ="Hello Hello Java Java python" ;
        String[] words = sentence.split(" " );

        Map<String, Integer> counts = new HashMap<>();

        for (String word: words) {
            counts.put(word , counts.getOrDefault(word , 0)+1);
//            counts.merge(word,1,(oldValue , newValue)-> oldValue + newValue); // second way to do same thing
        }

        System.out.println((counts));

    }
}
