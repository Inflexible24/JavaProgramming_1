package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {


        char[] letters = new char[26];

        char ch = 'A';
        for (int i = 0; i < letters.length; i++){
            letters[i] =ch;
        }
ch++;

      /*
        for (char i = 'A', j=0; i <= 'Z' && j < letters.length; i++, j++) {
       */
            //   letters[j] = (char)j ;
            //   }

            // letters[0] ='A';
            // letters[1] ='B';
            //  letters[2] ='C';


            System.out.println(Arrays.toString(letters)); // a-z


        System.out.println("__________________");

        char[] letters2 = new char[26]; // z-a

        for (char i = 'Z', j =0; i <='Z' && j < letters.length  ; i--, j--) {
            letters2[i]=(char)j;
        }


        System.out.println(Arrays.toString(letters2));













    }
}
