package week07;

/*
 Wat is pseudocode?
 */

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabbcccd";

        String result = ""; // a2b1c3d1


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // 'a'

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (c == str.charAt(i)) {
                    count++;
                }
            }
            if (result.contains("")) {
                continue;
            }
            result += c;
            result += count;

        }

        System.out.println("result = " + result);
    }
}
