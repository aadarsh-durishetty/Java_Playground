package workout;
import java.util.Scanner;
public class if_else {
    public static void main (String[] args) {
            Scanner in = new Scanner(System.in);
            // n = ritcher scale
            System.out.println("Enter the reading n: ");
            float n = in.nextFloat();

            if (n < 5.0) {
                System.out.println("Little or no damage");
            } else if (n >= 5.0 && n < 5.5) {
                System.out.println("Some damage");
            } else if (n > 5.5) {
                System.out.println("Seroius damage");
            } else {
                System.out.println("Invalid input");
            }
        }
    }

