package day22_MultiDimesionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {



        int arr2D[][] = { {1,2,3} ,{4,5,6,7,8} , {9,10,11,12,13} };
     // last arrays elements

        for (int i = arr2D.length - 1; i >= 0; i--) { // i = index number of 10 arrays starting from last index to 0

            for (int j = 0; j < arr2D[i].length; j++) { //j = index number of elements from 0 to last index
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");


        for (int i = 0; i < arr2D.length; i++) { // i: index of 1D array started from 0


            for (int j = arr2D[i].length - 1; j >= 0; j--) {  // forr to reverse

                System.out.print(arr2D[i][j]+" ");
            }

            System.out.println();
        }







    }
}
