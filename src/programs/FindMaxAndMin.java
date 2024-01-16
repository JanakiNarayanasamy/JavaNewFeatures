package programs;

import java.util.Arrays;
import java.util.List;

public class FindMaxAndMin {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer min = listOfIntegers.stream().min(Integer::compareTo).get();
        Integer max = listOfIntegers.stream().max(Integer::compareTo).get();
        System.out.println(min +" "+max);

    }
}
