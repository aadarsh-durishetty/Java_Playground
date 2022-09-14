package workout;
import java.util.Scanner;

interface Bank{
    int rate_of_interest = 12;
    int no_of_years = 3;
    int show();
}

class customer{
    String name;
    int id;

    void set_customer(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = in.next();
        System.out.print("Enter your id: ");
        id = in.nextInt();
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("id: "+id);
    }
}

class account extends customer{
    int acc_no;
    int acc_bal;

    void set_account(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter account number: ");
        acc_no = in.nextInt();
        System.out.print("Enter account balance: ");
        acc_bal = in.nextInt();
    }
    int interest(){
        int interest = acc_bal*Bank.rate_of_interest*Bank.no_of_years;
        return interest;
    }
}

public class Interface_bank implements Bank{
    public int show(){
        int PI = Bank.rate_of_interest*Bank.no_of_years;
        return PI;
    }

    public static void main(String[] args) {
        account a = new account();
        Interface_bank i = new Interface_bank();
        a.set_customer();a.set_account();
        System.out.println("Details of the customer: ");
        a.display();
        System.out.println("Interest for the following balance: ");
        System.out.println(i.show()*a.acc_bal);
    }
}
