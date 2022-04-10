package day33_Statics;

public class Test {

 public String name;

 public int age;

 public static String schoolName = "CydeoName";  // THAT IS STATIC VARIABLE

 public static void getSchoolInfo(){  // THAT IS STATIC METHOD
     System.out.println("School Name is "+ schoolName);
 }

public double radius;

 public static double pi = 3.14; // STATIC VARIABLE

 public static void displayValue(){  // THAT IS STATIC METHOD
     System.out.println("PI's value is "+ pi);
 }




}
