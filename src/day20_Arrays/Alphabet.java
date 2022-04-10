package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {


        char[] alpahabets = new char[26]; // z to a

        alpahabets[0] = 'Z'; // 90
        alpahabets[1] = 'Y'; // 89
        alpahabets[2] = 'X'; // 88


        char ch = 'Z';
        for (int i = 0; i < alpahabets.length; i++, ch--) {
            alpahabets[i] = ch;


        }
        for (char i=0, j='Z'; i < alpahabets.length; i++,j--){
            alpahabets[i] = j;
        }

        // system out println(alphabets)
        System.out.println(Arrays.toString(alpahabets));


    }
}
