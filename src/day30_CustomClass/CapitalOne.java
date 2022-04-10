package day30_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        EmployeeClass employee1 = new EmployeeClass();
        EmployeeClass employee2 = new EmployeeClass();
        EmployeeClass employee3 = new EmployeeClass();
        EmployeeClass employee4 = new EmployeeClass();
        EmployeeClass employee5 = new EmployeeClass();


        employee1.setInfo("John",'M',25,2237,"Developer",100000,true);
        employee2.setInfo("Anna",'F',28,2287,"QA",85000,true);
        employee3.setInfo("David",'M',35,2256,"QA",45000,false);
        employee4.setInfo("Lina",'F',45,2290,"Manager",80000,true);
        employee5.setInfo("Kevin",'M',35,2298,"Senior QA", 110000,true);


        EmployeeClass[] employees = {employee1,employee2,employee3,employee4,employee5};


        int countFullTime = 0;
        int countPartTime = 0;
        double max =employees[0].salary;
        double min =employees[0].salary;

        for (EmployeeClass employeeClass : employees){
            if (employeeClass.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }
            if (employeeClass.salary >max){
                max = employeeClass.salary;
            }

            if (employeeClass.salary< min){
                 min =employeeClass.salary;
            }








        }
        System.out.println(countFullTime);
        System.out.println(countPartTime);
        System.out.println(min);
        System.out.println(max);


    }
}
