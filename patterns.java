  /*      *
         * *
       * * * ------> pattern 1


package workout;
import java.util.Scanner;
public class patterns {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int n = in.nextInt();

        for (int i=0; i<n; i++) {
            int space = n-i-1;
            int star = i+1;
            for (int j=0; j<space; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<star; k++) {
                System.out.print("* ");    //id space given "* ", it forms perfect pyramid.
            }
            System.out.println(" ");
        }

    }
}
   */

/*  for pattern 1 both sides
  package workout;
  import java.util.Scanner;
  public class patterns {
      public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.println("Enter the no of rows: ");
          int n = in.nextInt();

          for (int i = 0; i < n; i++) {
              int space = n - i - 1;
              int star = i + 1;
              for (int j = 0; j < space; j++) {
                  System.out.print(" ");
              }
              for (int k = 0; k < star; k++) {
                  System.out.print("*");
              }
              System.out.println(" ");
          }
          for (int l = 1; l < n; l++) {
              int space1 = l;
              int star1 = n - l;
              for (int m = 0; m < space1; m++) {
                  System.out.print(" ");
              }
              for (int s = 0; s < star1; s++) {
                  System.out.print("*");
              }
              System.out.println(" ");

          }
      }
  }

 */