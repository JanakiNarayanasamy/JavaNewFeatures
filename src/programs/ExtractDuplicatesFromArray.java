package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExtractDuplicatesFromArray {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> set = new HashSet<>();
        listOfIntegers.stream().filter(i -> !set.add(i)).forEach(System.out::println);

    }
}
