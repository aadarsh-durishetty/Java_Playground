package workout;
import java.util.Scanner;
public class string_reg_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of students: ");
        int n = in.nextInt();
        String arr[] = new String[100];
        int scope=0, site=0;
        for (int i=0; i<n; i++){
            arr[i] = in.next();
        }
        for (int i=0; i<n; i++){
            if (arr[i].contains("BCE")){
                scope++;
            }
            else if (arr[i].contains("BIT")){
                site++;
            }
            else{
                System.out.println(arr[i]+" is not from SCOPE or SITE school so, can't be placed in MICROSOFT");
            }
        }
        System.out.println("No of students from SCOPE school: "+scope);
        System.out.println("No of students from SCOPE school: "+site);
    }
}
