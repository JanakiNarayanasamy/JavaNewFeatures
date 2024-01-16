package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CommonElementsBetweenArrays {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        Set<Integer> set= new HashSet<>();
        Stream.concat(list1.stream(),list2.stream()).filter(s -> !set.add(s) ).forEach(System.out::println);
        //
        list1.stream().filter(list2::contains).forEach(System.out::println);

    }
}
