package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {


        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println(frequency);

        System.out.println("-------------");

        String word = "cat cat cat cat dog dog dog dog cat cat ";
        word = word.toLowerCase();
        int fre2 = 0;

        while (word.contains("dog")) {
            word = word.replaceFirst("dog", "");
            fre2++;

        }
        System.out.println(fre2);



        String s ="java java java python python python";

        int countJava =0;
        int countPython=0;

        while (s.contains("java")|| (s.contains("python"))){

if (s.contains("java")){
    s=s.replaceFirst("java","");
    countJava++;
}
if (s.contains("python")){
    s=s.replaceFirst("python","");
    countPython++;

}

            System.out.println(countJava);
            System.out.println(countPython);



        }
    }
}
