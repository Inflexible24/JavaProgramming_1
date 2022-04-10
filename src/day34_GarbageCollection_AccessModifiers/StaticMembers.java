package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    static class class1{

    }


    public static  int num  = 100;

    public static void method(){

    }
    static {

    }







}
class b { //outer class


    static class a {
        public static void method1(){

        }



    }
}

class  c{
    public static void main(String[] args) {
        b.a.method1();
    }
}









