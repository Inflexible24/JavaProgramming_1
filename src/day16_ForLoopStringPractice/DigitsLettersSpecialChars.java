package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str = "00000000    omownfiwb@#$%    ^&*()47326329562";


        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str (0~ last index)

            char ch = str.charAt(i); // ch: each character that we have in str

            if (ch >= '0' && ch <= '9') { // if the character is between '0' to '9' then it is digit
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z'){ // A Z letter
                letters += ch;
            }else if (ch>='a' && ch <='z'){ // a z letter
                letters += ch;
            }else{ // if the character is neither digit nor letter its special character
               if (ch != ' '){
                specialChars += ch;
            } }

        }


        System.out.println("specialChars = " + specialChars);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);

    }
}
