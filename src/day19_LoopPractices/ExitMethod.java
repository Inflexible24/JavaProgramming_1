package day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { //01234

            if (i==5){
                System.exit(0);// terminates the program
            }

            //break; terminates the loop
            //continue; terminates the current iteration of the loop

            System.out.println(i);
        }

        System.out.println("Wooden Spoon");

    }
}
