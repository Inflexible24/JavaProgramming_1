package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {


        // a~z

        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }


        System.out.println();


        for (char i = 'A'; i <= 'Z'; i++) { // A, B, C, D, E
            System.out.println(i + " ");
        }

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (char i ='Z'; i>='A'; i--){
            System.out.print(i+" ");
        }

        System.out.println();

        for (char i =1; i<=4000; i++){
            System.out.println(i+" ");

        }
    }
}
