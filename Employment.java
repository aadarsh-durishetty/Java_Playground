package workout;
import java.util.Scanner;
class data {
    String name, qual, res, will;
    int age, exp, sal, govtExp;

    void data() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        this.name = name;
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        this.age = age;
        System.out.print("Enter your educational qualification: ");
        String qual = in.next();
        this.qual = qual;
        System.out.print("Enter the place of residence: ");
        String res = in.next();
        this.res = res;
        System.out.print("Enter your experience: ");
        int exp = in.nextInt();
        this.exp = exp;
        System.out.print("Experience within the government: ");
        int govtExp = in.nextInt();
        this.govtExp = govtExp;
        System.out.print("Enter your salary: ");
        int sal = in.nextInt();
        this.sal = sal;
        System.out.print("Enter the willingness to move outside home state: ");
        String will = in.next();
        this.will = will;
    }
    public static void StateJob(data d){
        if (d.qual.equals("intermediate")||d.qual.equals("UG")||d.qual.equals("PG")&&d.will.equals("no")&&d.govtExp >= 2&&d.exp >= 2&&d.age > 25) {
            System.out.println("congrats "+d.name+", you are eligible for state govt jobs!");
        } else {
            System.out.println("sorry "+d.name+", you are not eligible for state govt jobs.");
        }
    }
    public static void CentralJob(data d){
        if (d.qual.equals("PG")||d.qual.equals("UG") && d.will.equals("yes")&& d.govtExp >= 10 && d.exp >= 2 && d.age >= 25) {
            System.out.println("congrats "+d.name+", you are eligible for central govt jobs!");
        } else {
            System.out.println("sorry "+d.name+", you are not eligible for central govt jobs.");
        }
    }
}
    public class Employment {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            data d = new data();
            d.data();data.StateJob(d);data.CentralJob(d);
        }
    }

