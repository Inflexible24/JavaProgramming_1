package day16_ForLoopStringPractice;
/*
Java avaj ===> false
anna anna ====> ture

level
racecar
 */

public class PalinDrome {

    public static void main(String[] args) {





        String word = "CIVIC";

        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {

            reversed += word.charAt(i);

        }

        boolean isPalineDrome = word.equalsIgnoreCase(reversed);


        System.out.println("isPalineDrome = " + isPalineDrome);







    }
}
