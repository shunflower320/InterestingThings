/* String padding with String.format() */

import java.util.Scanner;

public class CoolJava {

    public static void whiteSpacePadding() {

        String leftpad = String.format("|%9s|", "12345678");
        String rightpad = String.format("|%-9s|", "12345678");
        
        System.out.println();
        
        System.out.println("Left padding:   String.format(\"|%9s|\",  \"12345678\") returns " + leftpad);
        System.out.println("Right padding:  String.format(\"|%-9s|\", \"12345678\") returns " + rightpad);
        
        System.out.println();
        
        int n = 15;
        String leftnpad = String.format("|%" + n + "s|", "123");
        String rightnpad = String.format("|%-" + n + "s|", "123");

        System.out.println("Alternatively, let's use a variable n\nint n = 15;\n");
        System.out.println("Left padding:    String.format(\"|%\" + n + \"s|\",   \"123\") returns " + leftnpad);
        System.out.println("Right padding:   String.format(\"|%-\" + n + \"s|\",  \"123\") returns " + rightnpad);
        
        System.out.println();
    
    }

    public static void leftZeroPadding() {

        String leftpad = String.format("%05d", 123);
        
        System.out.println();
        
        System.out.println("Left zero padding: String.format(\"%05d\", 123) returns " + leftpad);
        
        System.out.println();
        
        int n = 15;
        String leftnpad = String.format("%0" + n + "d", 123);

        System.out.println("Alternatively, let's use a variable n\nint n = 15;\n");
        System.out.println("Left zero padding: String.format(\"%0\" + n + \"d\", 123) returns " + leftnpad);
        
        System.out.println();

    }

    public static void main(String[] args) {

        // whiteSpacePadding();
        leftZeroPadding();

    }
}
