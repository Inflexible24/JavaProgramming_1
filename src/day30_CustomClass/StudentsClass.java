package day30_CustomClass;

import java.util.ArrayList;

public class StudentsClass {
    public static void main(String[] args) {


        Student OMER = new Student();
        OMER.setInfo("OMER",'F',21,222322,'A');

        Student SEYMA = new Student();
        SEYMA.setInfo("Seyma",'M', 43, 4242342, 'F');

        Student HAFSA = new Student();
        HAFSA.setInfo("Hafsa",'M',23,342432423,'F');

        Student IKRAM = new Student();
        IKRAM.setInfo("Ikram",'F',21,242413,'A');

        Student HANIFE = new Student();
        HANIFE.setInfo("Hanife",'M',39,213131, 'M');



        Student[] students = {OMER,SEYMA,HAFSA,IKRAM,HANIFE};

        for (Student student : students){
            System.out.println(student);
        }


        System.out.println("==================================");


        ArrayList<Student> earlyBirds = new ArrayList<>();  // grade: A

        ArrayList<Student> angryBirds = new ArrayList<>();


        for (Student student : students){

            if (student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);





    }
}
