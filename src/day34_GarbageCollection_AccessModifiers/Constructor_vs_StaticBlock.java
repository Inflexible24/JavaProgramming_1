package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("StaticBLock");

    }
    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");


        new Constructor_vs_StaticBlock(); // 1
        new Constructor_vs_StaticBlock(); // 2
        new Constructor_vs_StaticBlock();// 3
        new Constructor_vs_StaticBlock(); // 4
        new Constructor_vs_StaticBlock(); // 5

     // static block    // used for initializing static variables
                        // gets executed as soon as the class is loaded
                       // runs first before everything, only runs one time
                      //  also called * static initialization block*
                     //  if the static variables need several steps to be initialized
    }





















}
