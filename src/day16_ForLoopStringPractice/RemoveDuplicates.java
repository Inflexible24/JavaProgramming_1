package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String str = "aabbaacc";
        //0123456789

        String result = ""; //abc


        for (int i = 0; i <= str.length() - 1; i++) {// i:represents the all the index numbers of str

            String ch = ""+ str.charAt(i); // represents each Character of str

            if (!result.contains(ch)){ // if the character is not contained in the result
                result += ch; // the character will be added to the result

            }



        }

        System.out.println(result);
    }
}
