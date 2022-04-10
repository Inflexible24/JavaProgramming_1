package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);


        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password");
        String p = input.next();

        if (u.equals("Cydeo")&& p.equals("WoodenSpoon")){

            System.out.println("Logged In");

        }else{
            for (int i = 1; i <3 ; i++) {

                System.out.println("Incorect username or password");
                System.out.println("Enter your username");
                u= input.next();
                System.out.println("enter your password");
                p= input.next();

                if (u.equals("Cydeo")&& p.equals("WoodenSpoon")){

                    System.out.println("Logged In");
                    break;
                }
            }



            if (! (u.equals("Cydeo")&& p.equals("WoodenSpoon"))){

                System.out.println("Your account is locked, Please contact support team");
            }

        }




























































































    }
}
