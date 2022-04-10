package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {


        // store the elements = 10, 20, 50 ,70



        int[] numbers= {10,20,50,70}; // size

        System.out.println(Arrays.toString(numbers));

        System.out.println("______________");

        // create a variable that can contain 5 scores

        int[] scores = new int[5];

        scores[1]=85;
        scores[scores.length -1]= 95;
        scores[3]= 75;
        scores[0]= 65;
        scores[2]= 55;

        System.out.println(Arrays.toString(scores));


        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};  //0 ~ 11 (length -1)

/*
        System.out.println(months[0]); // jan
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[3]);
*/

        for (int i = 0; i < months.length; i++) { // represents the index numbers of array starting from 0

            System.out.println(months[i]);
        }

        System.out.println("---------------------");

        for (int i =months.length-1; i >= 0;i-- ) { // i: represents the index numbers of array startin gfro  last index

        }





















    }
}
