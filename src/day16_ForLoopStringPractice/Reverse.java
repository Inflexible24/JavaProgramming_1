package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        // index:   012345678


        String result = "";  // contain the reversed version of str

        //noopS nedooW

        for (int i = str.length() - 1; i >= 0; i--) { // i: index numbers of str ( starting last index to index 0)

            result += str.charAt(i); // adding each character to result
        }System.out.println(result);


    }
}
