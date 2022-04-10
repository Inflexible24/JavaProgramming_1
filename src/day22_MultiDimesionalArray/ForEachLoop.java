package day22_MultiDimesionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {


        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}}; // if the iderationl orders beginnig to the end than you can use FOR EACH LOOP

/*
        for (int[] each :  arr2D) {
            //System.out.println(Arrays.toString(each)); // how to get SINGLE ARRAY FOR INDEX


            for (int eachElement :each){

                System.out.println(eachElement);
            }
        }
*/ // YOU HAVE TO USE IT IF YOU WANT THE NUMBERS BEGINNING TO THE END

        for (int[] each : arr2D) {
            for (int element : each) {
                System.out.println(element);

            }


        }

    }
}
