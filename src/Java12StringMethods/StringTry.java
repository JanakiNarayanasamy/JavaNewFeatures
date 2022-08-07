package Java12StringMethods;

import java.lang.invoke.MethodHandles;

public class StringTry {
    public static void main(String[] args) {
        String first=" can we skip to the good part";
        System.out.println(first);
        //moves the string right-adds the spaces in beginning
        System.out.println(first.indent(2));
        String second= first.transform(value-> new StringBuilder(value).reverse().toString());
        System.out.println(second);
        System.out.println(second.describeConstable());
        System.out.println(second.resolveConstantDesc(MethodHandles.lookup()));
    }
}
