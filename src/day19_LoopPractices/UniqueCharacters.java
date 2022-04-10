package day19_LoopPractices;

public class UniqueCharacters {


    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; // bdf


        for (int j = 0; j < str.length(); j++) {
            char ch = 'f';
            int count= 0; // represents the frequency of the ch


            for (int i = 0; i < str.length(); i++) { // compares the character that outer loop picked with each character
                char each = str.charAt(i); // each character of str

                if (ch==each){
                    count++;
                }
        }

            if(count != 1){
                continue;
            }
            result +=ch;

            System.out.println(result);

        }
    }
}
