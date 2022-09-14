package workout;
import java.util.Scanner;
public class pattern {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();
        for (int i= 0; i<= rows-1; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
        for (int i=rows-1; i>=0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}
