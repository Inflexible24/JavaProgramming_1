package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {


        Car bmw = new Car();
        bmw.setInfo("BMW", "M3", "WHITE", 2013, 23000);
        bmw.start();
        bmw.stop();
        bmw.drive();
        System.out.println(bmw);

        Car audi = new Car();
        audi.setInfo("Audi", "M320", "White", 2020, 30000);
        audi.start();
        audi.stop();
        audi.drive();

        Car toyota = new Car();
        toyota.setInfo("Toyota","Cambry","White",2022,30000);
        toyota.stop();
        toyota.start();
        toyota.drive();
        System.out.println(toyota);


      //  Car[] cars = {bmw, audi, toyota};

        System.out.println("================================================");

        ArrayList<Car> carList = new ArrayList<>();

        carList.addAll(Arrays.asList(bmw,audi,toyota));

        for ( Car each: carList){
            System.out.println(each.brand + each.price);
        }



        carList.removeIf(p -> p.brand.equals("BMW")&& p.year >= 2005 && p.year <= 2008);
        carList.removeIf(p -> p.brand.equals("Toyota")&& p.year>= 1995 && p.year <= 1997);


    }
}
