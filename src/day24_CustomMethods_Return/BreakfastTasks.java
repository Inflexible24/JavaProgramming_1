package day24_CustomMethods_Return;

import java.sql.SQLOutput;

public class BreakfastTasks {

    public static void main(String[] args) {
        initials("Ömer", "Ilikcay");   // Ö.I
        domain("omerilincajt@hotmail.com");


        String[] emails = {"josh@gmail.com","Jim@yahoo.com","Elminur@cydeo.com","Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);

        }


        nameOfMonth(7);
    }

    // 1. Create a method that can display the initials of the person/  initials(String firstname,String lastname)
    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0)+" . "+ lastName.charAt(0);
        initial= initial.toUpperCase();
        System.out.println("initial = " + initial);
    }


    // 2. Create a method that can display the domain of the email
    public static void domain(String email){

        String domain = email.substring( email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){ // 85

        String name =  "";
        if (number >=1 && number <=12){

            name =(number==1)? "Jan" : (number==2)? "Feb" :  (number==3)? "March" : (number==4)? "April" : (number==5)? "Mei" : (number==6)? "Juni" : (number==7)? "Juli" : (number==8)? "Augustus" : (number==9)? "September" : (number==10)?
                    "Oktober" : (number==11)? "November" : "December";



        }else{
            name="Invalid";
        }
        System.out.println("Month name = " +name);
    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){

        int dayNumber =0;


    }

    //5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){

    }

/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

    6. agegroups(int)
 */

}









