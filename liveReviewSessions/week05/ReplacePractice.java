package week05;

import java.sql.SQLOutput;

public class ReplacePractice {
    public static void main(String[] args) {


        String word ="github";

        String word2 = word.replace("hub","lab");
         // actually an object is created but not assigned to a reference (so we an unreferenced object) Garbage collector cleans that object
        System.out.println(word2);
        // JAVA Memory Usage Topic

        System.out.println("word = " + word);

        System.out.println(word.replace('i','o'));

        String searchResult = "1- 48 of over 6,000 results for java";
        String actualResult = searchResult.replace("1- 48 of over ","");
        String normalResult = searchResult.replace(" result for java","");

String expectedResult = "6,000 ";
if (expectedResult.equals(actualResult)){
    System.out.println("Pass");
}else{
    System.out.println("Fail");
}
    }
}
