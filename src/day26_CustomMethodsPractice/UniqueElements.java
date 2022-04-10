package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] array ={1,1,2,3,3,4,5,5,6,7,7,7,2,4,6};

        int[] unique =uniqueElements(array);

        System.out.println(Arrays.toString(unique));


        double[] array2 ={3.5,1.4,1.6,5.6,2.6,7.6,5.7};


        array2= uniqueElements(array2);

        System.out.println(Arrays.toString(array2));

    }

    // returns the unique elements of the array as a new array
    public  static int[] uniqueElements(int[] array){

        int[] result ={}; // new int[0] // just for temporary

        for (int each : array){

            if (ArraysUtility.frequencyOfElement(array,each)==1){ // if the frequenact is one the element is unique
             result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // returns the unique elements of the array as a new array
    public  static double[] uniqueElements(double[] array){

    double[] result ={}; // new int[0] // just for temporary

    for (double each : array){

        if (ArraysUtility.frequencyOfElement(array,each)==1){ // if the frequenact is one the element is unique
            result=ArraysUtility.addElement(result,each);
        }
    }
    return result;
}


    // returns the unique elements of the array as a new array
    public  static String[] uniqueElements(String[] array){

        String[] result ={}; // new int[0] // just for temporary

        for (String each : array){

            if (ArraysUtility.frequencyOfElement(array,each)==1){ // if the frequenact is one the element is unique
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }















}


