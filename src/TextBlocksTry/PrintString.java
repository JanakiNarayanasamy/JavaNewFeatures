package TextBlocksTry;

public class PrintString {
    public static void main(String[] args) {
        //\s- fpr trailing spaces, which will be usually ignored by compiler
        String greeting = """
                Hi,Good evening Everybody,  \s
                Have a nice Day
                """;
        System.out.println(greeting);
    }
}
