package day24_CustomMethods_Return;

public class Return_vs_ExitMethod {


    public static void main(String[] args) {


        nameOfMonth(50);

        System.out.println("Hello World");
    }

    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) { // 85


        if (number < 1 || number > 12) {  // if number is invalid
            System.out.println("Invalid");
         //   return; // exits nameofmonth method remaining code fragments of the method never gets executed
            System.exit(0);
        }


        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "Mei" : (number == 6) ? "Juni" : (number == 7) ? "Juli" : (number == 8) ? "Augustus" : (number == 9) ? "September" : (number == 10) ?
                "Oktober" : (number == 11) ? "November" : "December";


        System.out.println("Month name = " + name);

    }
}