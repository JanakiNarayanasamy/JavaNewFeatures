package programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddAndEvenNumbers {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> collect = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(collect);
    }

}
