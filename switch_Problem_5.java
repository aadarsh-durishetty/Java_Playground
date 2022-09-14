package workout;

import java.util.Scanner;

public class switch_Problem_5 {
    public static void main( string_vowels_digits[] args) {
        Scanner in = new Scanner(System.in);
        char con;
        do {
            System.out.println("Press '+' for addition, '-' for substraction, '*' for multiplication, '/' for division");
            System.out.print("Enter the operator: ");
            char ch = in.next().charAt(0);
            System.out.print("Enter first number: ");
            int a = in.nextInt();
            System.out.print("Enter second number: ");
            int b = in.nextInt();
            switch(ch){
                case ('+'):
                    System.out.println("The result is: "+ (a+b));
                    break;
                case ('-'):
                    System.out.println("The result is: "+ (a-b));
                    break;
                case ('*'):
                    System.out.println("The result is: "+ (a*b));
                    break;
                case ('/'):
                    System.out.println("The result is: "+ (a/b));
                    break;
            }
            System.out.println("Enter Y/N for continuation: ");
            con = in.next().charAt(0);
        } while (con == 'Y');

        System.out.println("Bye........");
    }
}
