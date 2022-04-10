package day15_ForLoop;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {


        String str = " ";

        boolean r = str.isEmpty();


        System.out.println(r);

        boolean r1 = str.isBlank();

        System.out.println(r1);


        String str2 = "Cydeo   ";

        System.out.println(str2.isEmpty());


        String s2 = "CYDEO";
        String s3 = "cydeo";

        System.out.println(s2.equals(s2)); // true

        System.out.println(s3.equalsIgnoreCase(s2)); // ture

        System.out.println("--------------------");

        System.out.println("yEs".equalsIgnoreCase("Yes"));

        String sentence = "My favorite programming language is Java";

        boolean hasCSsharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");

        boolean s34 = sentence.toLowerCase().contains("java");

        boolean r3 = sentence.contains("java") || sentence.contains("Java");


        System.out.println(hasCSsharp);
        System.out.println(hasJava);


        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); //true
        System.out.println(input1.equalsIgnoreCase(input2));


        System.out.println(input1.contains("Java"));

        System.out.println(input1.toLowerCase().contains("java")); // true

        System.out.println(input1.toUpperCase().contains("JAVA")); // true


        String a = "ALI";

        boolean x = a.startsWith("AL");
        boolean y = a.toLowerCase().endsWith("I");



        System.out.println(x);
        System.out.println(y);


    }
}
