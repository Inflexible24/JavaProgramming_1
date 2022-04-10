package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 30; // 30-7 =23 -7 = 16 - 7 =9
        int b = 7;

        int count = 0; // count =1+1+1+1=4

        while (a >= b) {
            a -= b;
            count++;

        }
        System.out.println(count+ " with a reaminder of "+a);

    }
}
