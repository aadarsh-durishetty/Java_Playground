package workout;
import java.util.Scanner;
public class string_grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of student: ");
        String target = in.next();
        System.out.print("Enter the no of students: ");
        int len=0;
        int n = in.nextInt();
        double[] cgpa = new double[n];
        String[] names = new String[n];
        System.out.println("Enter the student cgpa: ");
        for (int i = 0; i < n; i++) {
            cgpa[i] = in.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            if (cgpa[i] >= 9.0)
               len++;
        }
        System.out.println("Enter the student names that are eligible: ");
        for (int i=0; i<len; i++){
            names[i] = in.next();
        }
        for (int i = 0; i < len; i++) {
            if (names[i].equals(target)) {
                System.out.println("Name is present");
                System.out.println(names[i] + " is a 9.0 pointer");
            }
            else{
                break;
            }
        }
    }
}