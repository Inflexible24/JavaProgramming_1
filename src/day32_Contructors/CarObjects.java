package day32_Contructors;

public class CarObjects {

    public static void main(String[] args) {



        Car car1 = new Car("Toyota");

        Car car2 = new Car("Honda", "Accord");

        Car car3 = new Car("Lexuc ", "m3", 4333);

        Car car4 = new Car("BMW", "Mg", 321213,23233);

        Car car5 = new Car("TESLA", "Mg", 321213,23233, "RED");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
