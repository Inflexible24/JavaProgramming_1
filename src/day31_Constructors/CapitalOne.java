package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

BankAccount account =new BankAccount();

account.setInfo("Ömercim",9204932042423l);

        System.out.println(account);

        account.deposit(2311231);
        account.checkBalance();
        account.withdraw(9000);
        account.checkBalance();


        System.out.println("=========================");
        BankAccount account2 = new BankAccount();

        account.setInfo("Hafsa", 32423424l);

        account2.checkBalance();
        account2.deposit(200);
        account2.checkBalance();

    }
}
