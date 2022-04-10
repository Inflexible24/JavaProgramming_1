package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {



        // 15 16 17 18 19 20

        for (int i = 15; i <= 45; i++) {

            System.out.print(i + " ");


        }

        System.out.println();
        System.out.println("Hello");


        // 100 99 98 97 96 95 94 93 92 91 90
        for (int i = 100; i >= 50; i--) {

            System.out.println(i + " ");
        }


        // print al the numbers between 1~ 55

        for (int i =1; i<=55; i++){

            if (i%2==0){
                System.out.println(i+" ");
            }
        }

        for (int i = 2; i<=54; i+=2){ // i: 2,4,6,8,10....
            System.out.println(i+ " ");

        }












    }
}
