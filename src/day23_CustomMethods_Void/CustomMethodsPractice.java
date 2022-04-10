package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        message90();
        cydeoMessage();
        evenNumber();

    }

    // create a function that can print hello world 5 times ==> helloWorld5times
    public static void message90() {

        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");

        }

    }



    // create a function that can print hello Cydeo 5 times +== helloCydeo5Times
    public static void cydeoMessage(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");

        }

    }





    // create a function that can print all the even numbers from 1-10 ==> even numbers
    public static void evenNumber(){
        for (int i = 2; i<11; i+=2){
            System.out.println(i);
        }


    }




}
