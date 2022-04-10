package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {


        ArrayList<Integer> n = new ArrayList<>();

        n.add(10); //
        n.add(20);
        n.add(30);
        n.add(40);
        n.add(50);


        n.add(2,25); // 0
        n.add(5,45);

        System.out.println(n);


        System.out.println(n.size());

       int lastIndex  = n.size() -1;

        System.out.println(lastIndex);

        int num =n.get(3);

        System.out.println(num);

        System.out.println("--------------------");


        for (int i = 0; i < n.size(); i++) {
            System.out.println(n.get(i));

        }
        System.out.println("-------------------------");

ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
list.add("Java");
list.add("C#");
list.add("Ruby");

list.set(2,"JavaScript");
list.set(3,"C++");

System.out.println(list);




















































    }
}
