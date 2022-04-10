package day17_While_DoWhile;

public class BranchingStatements2 {


    public static void main(String[] args) {


        for (char y = 'A'; y <= 'E'; y++) {


            if (y == 'C') {
                continue;
            }
            System.out.println(y);
        }

        System.out.println("------------------");


        //print all od numbers between 1~10 (skip the even numbers)

        for (int i =1; i<11; i++){

            if (i%2 ==0){
                continue;



            }

            System.out.println(i);


        }


    }
}
