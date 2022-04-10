package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {


        int[]  numbers ={10,4,20,3,1,0};
        int max =numbers[0]; //10

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){ // if there is element in the array thats greater than the current max number
                if (numbers[i] >max){
                    max = numbers[i]; // assiging greater number to variable max

                }
                System.out.println(max);
            }
        }
    }
}
