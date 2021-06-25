package concepts.java8.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Get frequency of words using java 8 features
 *
 */
public class FrequencyOfWords {

    public static void main(String[] args) {

        List<String> file = new ArrayList<>();
        file.add("sr21");
        file.add("test2");
        file.add(("sumtr"));
        file.add("high");
        file.add("test2");
        file.add("sr21");
        Map<String,Integer> map= new HashMap<>();

        file.stream()
                .collect(Collectors.toMap(w -> w.toLowerCase(), x -> 1, Integer::sum))
                        .entrySet()
                        .stream()
                        .forEach(x -> {
                            System.out.println(x.getKey() + "Count "+ x.getValue());
                        });



    }


}
