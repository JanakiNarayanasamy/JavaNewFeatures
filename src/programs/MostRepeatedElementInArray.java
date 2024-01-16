package programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElementInArray {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        String s = listOfStrings.stream().collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .get();
        System.out.println(s);
        Map.Entry<String, Long> stringLongEntry = listOfStrings.stream().collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get();
        System.out.println(stringLongEntry.getKey());
        System.out.println(stringLongEntry.getValue());

    }
}
