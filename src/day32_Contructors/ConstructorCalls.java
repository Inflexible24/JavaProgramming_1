package day32_Contructors;

public class ConstructorCalls {

    public  ConstructorCalls(){
        System.out.println("Default");
    }

    public  ConstructorCalls(int a){
        this();
        System.out.println("Cons with ant argument");
    }

    public  ConstructorCalls(String str){

        this(10);

        System.out.println("Cons with String argument");

    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls(10);

        System.out.println("========================");

        ConstructorCalls obj2 = new ConstructorCalls("JAVA");

        System.out.println("=========================");

        ConstructorCalls obj3 = new ConstructorCalls();

    }

}
