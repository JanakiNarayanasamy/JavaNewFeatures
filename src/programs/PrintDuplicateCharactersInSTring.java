package programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateCharactersInSTring {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        Arrays.stream(inputString.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .forEach(System.out::println);
        //First Repeated character
        Optional<Map.Entry<String, Long>> first = Arrays.stream(inputString.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .findFirst();
        System.out.println(first.get().getKey());
    }
}
