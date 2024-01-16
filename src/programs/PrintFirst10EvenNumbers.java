package programs;

import java.util.stream.IntStream;

public class PrintFirst10EvenNumbers {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,20).filter(i -> i%2 ==0 ).forEach(System.out::println);
    }
}
