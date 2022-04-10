package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {


    public static void main(String[] args) {
        
        
        int[] arr = {1,2,3,4,5};
        
       arr  =replace(arr,2,30);

        System.out.println(Arrays.toString(arr));
    }
    
    
    
             //    1,2,3,4,5                 200              30
    public static int[] replace(int[] array, int index, int newElement){
        
        if (index<0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        
        return array;
    }
    //    1,2,3,4,5                 200              30
    public static double[] replace(double[] array, int index, double newElement){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index] = newElement;

        return array;
    }
    
    
}
