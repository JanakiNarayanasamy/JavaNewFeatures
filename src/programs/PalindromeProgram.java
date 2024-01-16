package programs;

import java.util.stream.IntStream;

public class PalindromeProgram {
    public static void main(String[] args) {
        String str = "ROTATOR";
        boolean b = IntStream.range(0, str.length() / 2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
        if (b) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
