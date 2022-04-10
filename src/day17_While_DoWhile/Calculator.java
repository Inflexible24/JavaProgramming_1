package day17_While_DoWhile;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculator<ch> {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your first number");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number");
        int num2 = scan.nextInt();


        System.out.println("enter a match operator");
        char ch = scan.next().charAt(0);
        while (!(ch == '+' || ch == '-')) { // if the operator is invalid

            ch = scan.next().charAt(0);
            System.out.println("Invalid Operator, Please re-enter");
        }

        System.out.println((ch == '+')? num1 +num2 : num1- num2);

    }

}
