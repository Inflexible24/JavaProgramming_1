package day20_Arrays;

import day15_ForLoop.ForLoopIntro;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Java","Java", "C#","Python"};

        for (int j = 0; j < words.length ; j++) {


        String element = words[0]; // "Java"
        int frequency =0;

        for (int i = 0; i < words.length; i++) { //find the frequency of element from array
            if (words[i].equals(element)){
                frequency++;
            }
        }
        if (frequency==1){
            System.out.println(element);
        }
    }
}}
