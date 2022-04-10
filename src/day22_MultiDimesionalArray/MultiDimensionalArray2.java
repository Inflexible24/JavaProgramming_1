package day22_MultiDimesionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {

// ONE DIMENSION ARRAY
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};
// TWO DIMENSION ARRAY

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

// 3 dimensional array  contains 2 d arrays
//                           0      1      2            0       1       2
        int[][][] each = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}};
        //                        0                               1

        //[index num if 2Darray][index num of 1D array][Index number of elements]

        System.out.println(Arrays.deepToString(each));


        // alles
        System.out.println(Arrays.deepToString(each[1]));

        // 1,1 40 50 60
        System.out.println(Arrays.toString(each[1][1]));

         //9
        System.out.println(each[0][2][2]);

        System.out.println("______________________");
        for (int[][] each2D:each) {
            for (int[] each1D:each2D) {
                for (int element: each1D) {
                    System.out.println(element);
                }


      int[][][][] arr4D = {{{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90} }   }};


                for (int[][][] each1 : arr4D) {
                    for (int[][] each2D1 : each1) {
                        for (int[] each1D1 : each2D1) {
                            for (int element : each1D1) {
                                System.out.println(element);
                            }

                        }

                    }
                }

                    

                    
                










                

        }


    }}}

