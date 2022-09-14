package workout;
import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = in.nextLine();
        String arr[]=s.split(" ");
        for(int i=0;i< arr.length;i++) {
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
