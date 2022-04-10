package day16_ForLoopStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabccc";

        String result = "";


        for (int i = 0; i <= str.length(); i++){

            char ch =str.charAt(i); // ch each characters of str

            if (str.indexOf(ch)== str.lastIndexOf('a')){ // if the first and last index numbers of the characters are same then the character is uniq.

                result +=ch;
            }


        }
        System.out.println(result);



    }
}
