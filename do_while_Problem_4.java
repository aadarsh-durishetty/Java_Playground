package workout;
import java.util.Scanner;
public class do_while_Problem_4 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Enter a number: ");
            int num = in.nextInt();

            if (num>1 && num<100) {
                System.out.println(num+" is between 1 and 100");
                System.out.println("Thank you.....Welcome again");
                break;
            }
            else {
                System.out.println("Sorry, "+num+" is not between 1 and 100");
            }
        } while(true);

    }
}
