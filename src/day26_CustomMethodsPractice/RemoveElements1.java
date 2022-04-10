package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500 ,600};

       numbers= removeElements(numbers,1); // 100,200,300,400,500,

        System.out.println(Arrays.toString(numbers));





    }

    //                                 1,2,3,4          2
    public static int[] removeElements(int[] array, int index) {

        if (index<0 || index > array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];

        int j = 0;
        for (int each : array) {

            if (each == array[index]) { // if the elements if matching with the element at given index

                continue;  // skip

            }
            result[j++] = array[1];
        }

        return result;
    }
}
