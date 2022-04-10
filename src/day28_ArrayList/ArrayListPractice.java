package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer>  numbers = new ArrayList<>();


        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.add(40); //3
        numbers.add(50); //4
        numbers.add(60); //5
        numbers.add(70); //6

        System.out.println(numbers);
 // 2 katini alip yazdirdik
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);


        }
        System.out.println(numbers);


        System.out.println("-----------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");


        System.out.println(employees);


        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);


        employees.remove(1);
        System.out.println(employees);

        employees.remove(employees.size()-1);
        System.out.println(employees);


        employees.remove("Hulya");
        System.out.println(employees);

        employees.remove("Neira");
        System.out.println(employees);

        boolean r1 = employees.remove("Hulya");

        boolean r2 = employees.remove("Neira");


        System.out.println(r1);
        System.out.println(r2);




    }
}
/*
{1,2,3,4,5,6}

{2,4,6,8,10,12}
 */