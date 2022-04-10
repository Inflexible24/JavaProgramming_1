package day15_ForLoop;

import java.util.Scanner;

public class StartWithX {
    public static void main(String[] args) {

        System.out.println("enter a word");
        String word = new Scanner(System.in).next(); // use that if you want get only one input
// equals is for string

        if (word.charAt(0) == 'x') {
            word = word.replaceFirst("x", "a");
        }

        System.out.println(word);
    }
}
