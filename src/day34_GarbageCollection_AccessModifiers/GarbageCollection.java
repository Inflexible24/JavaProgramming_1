package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Car;
import day30_CustomClass.Dog;
import day33_Statics.Iphone;

public class GarbageCollection {
    public static void main(String[] args) {


      // String str = null;

      //  System.out.println(str);


          String str = "Wooden Spoon";  // after line 13, wooden spoon will be eligible for garbage collection
          str =null;

        System.out.println(str);

        Car car1 = new Car();
        car1= null;


        Dog dog1 = new Dog();

        dog1.name = "Lucy";

        dog1 =new Dog();

        dog1.name = "Max";

        System.out.println(dog1);















    }
}
