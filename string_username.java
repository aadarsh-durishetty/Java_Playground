package workout;
import java.util.Scanner;
public class string_username {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Username: ");
        String username = in.next();
        System.out.print("Enter the Password: ");
        String password = in.next();
        System.out.print("Confirm the password entered: ");
        String confirm_password = in.next();
        if (username.length() != 0 &&
                password.length() != 0 && password.length() >= 8
                && username.contains(username) && password.equals(confirm_password)) {
            System.out.println("Congratulations, Process Successful.");
        } else {
            System.out.println("Sorry, Process failed.");
        }
    }
}