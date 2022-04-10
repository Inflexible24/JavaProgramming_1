package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {


        int[] intArray = {4,6,8,-1,5,2};
        Arrays.sort(intArray);

        double[] doubleArray= {10.5,11.5,5.5,4.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'E', 'F','B','D','C','A'};
        Arrays.sort(charArray);


        sumOfNumbers(4.5,2.3,7.4);

        int num4 =sumOfNumbers(1,4,5);

        System.out.println(num4);

        double sum5 = sumOfNumbers(4.5,5.5,6.7);

        System.out.println(sum5);


    }

    public static int sumOfNumbers(int num1, int num2){

        return num1+ num2;
    }

    public static double sumOfNumbers(double num1, double num2){
        return num1+ num2;
    }

    public static int sumOfNumbers(int num1,int num2,  int num3){
        return num1+num2+num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3){
        return num1+ num2+num3;
    }

    public static int sumOfNumbers(int num1,int num2,  int num3, int num4){
        return num1+num2+num3 +num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4){
        return num1+num2+num3+num4;
    }
}
