package programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        String collect = Arrays.stream(str.split(" ")).map(str1 -> new StringBuffer(str1).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
