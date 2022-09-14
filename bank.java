package workout;
import java.util.*;
        class bank_account {
            int id;
            double bal; //balance for account
            double annual_ir; //store interest rate
            String  date;

            bank_account (int id1, double bal1, double annual_ir1, String date1) {
                id = id1;
                bal = bal1;
                annual_ir = annual_ir1;
                date = date1;

            }

            public int getid1() {
                return id;
            }
            public double getbal1(){
                return bal;
            }
            public double get_annual_ir1() {
                return annual_ir;
            }
            public String getdate(){
                return date;
            }
            double withdraw (double amount) {
                return bal = bal - amount;
            }
            double deposit(double amount) {

                return bal = bal + amount;
            }

            public static void main(String[] args) {
                Scanner in = new Scanner (System.in);
                bank_account b = new bank_account (7777, 50000, 5.3,"25/08/2022"); //

                System.out.println("Account ID: "+b.getid1());
                System.out.println("Date : "+b.getdate());
                System.out.println("Initial Balance: "+b.getbal1());
                System.out.println("Balance after Withdraw: "+b.withdraw(5000));
                System.out.println("Balance after deposit: " +b.deposit(2000));
                System.out.println("Interest Rate: "+b.get_annual_ir1());
            }
        }
/*
import java.util.Scanner;
class Account{
    private int id;
    private double balance;
    private double annualIntrestRate;
    private String datecreated;
    public boolean Withdraw(double amount){
        if(balance>=amount){
            balance=balance-(amount);
            return true;
        }
        else{
            System.out.printf("\nInsufficient Amount\n");
            return false;
        }
    }
    public void deposit(double amount){
        balance=balance+amount;
    }
    public void set(){
        Scanner ip = new Scanner(System.in);
        System.out.printf("Account id = ");
        id=ip.nextInt();
        System.out.printf("Balance = ");
        balance=ip.nextDouble();
        System.out.printf("Annual Intrest Rate = ");
        annualIntrestRate=ip.nextDouble();
        System.out.printf("Date Created = ");
        datecreated=ip.next();
    }
    public void display(){
        System.out.printf("\n**Account Information**\n\n");
        System.out.printf("Account id = %d\n",id);
        System.out.printf("Balance = Rs %.3f\n",balance);
        System.out.printf("Annual Intrest Rate = %.3f\n",annualIntrestRate);
        System.out.printf("Date Created = %s\n",datecreated);
    }
};
public class bank_account {
    public static void main(String[] args) {
        Account customer = new Account();
        customer.set();
        System.out.printf("\nMENU\n1.Deposit\n2.Withdraw\n3.Account Information\n4.Exit\n");
        int choice=0;
        System.out.printf("Choice = ");
        Scanner ip = new Scanner(System.in);
        choice=ip.nextInt();
        while((choice==1)||(choice==2)||(choice==3)){
            if(choice==1){
                System.out.printf("Enter Amount = ");
                double amt = ip.nextDouble();
                customer.deposit(amt);
            }
            else if(choice==2){
                System.out.printf("Enter Amount = ");
                double amt = ip.nextDouble();
                customer.Withdraw(amt);
            }
            else if(choice==3){
                customer.display();
            }
            System.out.printf("\nChoice = ");
            choice=ip.nextInt();
        }
        System.out.printf("\n\nThank You!");
    }
}

*/