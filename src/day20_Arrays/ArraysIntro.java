package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

    // create a variable that s capable enough to contain 5 names


       String myGroup[] = new String[5];
       myGroup[0] ="Gunay";
       myGroup[1] ="Neira";
       myGroup[2] ="Suat";
       myGroup[3] ="Hulya";
       myGroup[4] ="Mikael";
       // myGroup[5]="Omer";


        //System.out.println(myGroup); // hashcode

        System.out.println(Arrays.toString(myGroup)); // Gunay Neira Suat Hulya Mikael


        System.out.println("------------------");



        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Satuday","Sunday"};

        System.out.println(Arrays.toString(days));

        int num= 4;

        if (num<1 || num >7){
            System.out.println("invalid Number");
            System.err.println(0);
        }

        System.out.println(days[num-1]);














    }
}
