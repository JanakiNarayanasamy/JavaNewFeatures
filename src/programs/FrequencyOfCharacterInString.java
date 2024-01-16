package programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacterInString {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        Map<String, Long> collect = Arrays.stream(inputString.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
    }
}
