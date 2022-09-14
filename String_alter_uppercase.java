package workout;
import java.util.Scanner;
public class String_alter_uppercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = in.next();
        String arr[] = s.split("");
        System.out.print("The altered string: ");
        for (int i=0; i<arr.length; i++){
            if (i%2 == 0)
                System.out.print(arr[i].toUpperCase());
            else
                System.out.print(arr[i]);
        }
    }
}
