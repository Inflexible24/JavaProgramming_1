package day02_HelloWorld;

import javax.swing.undo.AbstractUndoableEdit;
import java.lang.reflect.Array;
import java.util.Arrays;

public class HelloCydeo {
    public static void main(String[] args) {

        System.out.println("Hello Cydeo");
        System.out.println("Wooden Spoon");

     String s  ="the game was tied at 2-2";

     String s2 = s.substring(5);

 int number =5;

 while (number<100){
     number+=number;
 }
        System.out.println(number);

int[] nums = new int[5];

int a =5;

nums[2]= a--;
        nums[0]=a*2;
                nums[4]=--a + (a-9);
                        nums[1]=nums[2];
                                nums[3]=nums[a-3];

        System.out.println(Arrays.toString(nums));


 //       String [] strs ={"}
//

//9 23








    }








}
