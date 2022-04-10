package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,4,2,2,2,2,2,1,1,1,1,1,1,1,3,3,3,3,3,3,3,3,3,3,3,};
        arr =removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));



     //   String[] words = {"Java"," Java","Python", "C#", "Java","Java" };
    //    words =removeDuplicates(words);
     //   System.out.println(Arrays.toString(words));

        int[] numbers = {1,2,3,4,5,6,7,8,9,};
      //  numbers = Arrays.stream(numbers).distinct().toArray();
      //  System.out.println(Arrays.toString(numbers));

    }

    //                                   {1,1,1,1,2,2,2,2,2,2,3,3}
    public static int[] removeDuplicates(int[] array) {

        int[] result ={}; //{1,


        for (int each :array){
            if (!ArraysUtility.contains(result,each)){
               result=ArraysUtility.addElement(result,each);

            }

    }
        return result;
}



}
