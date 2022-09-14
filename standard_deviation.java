package workout;
import java.util.Scanner;
import java.lang.Math;
public class standard_deviation {
    public static void main(string_vowels_digits[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = in.nextInt();
        double [] arr = new double [n];
        double [] diff = new double[n];
        double [] num = new double [n];

        for (int i=0; i<n; i++) {
            arr[i] = in.nextDouble();
        }
        double sum1 = 0.0;
        double sum2 = 0.0;

        for (int i=0; i<n; i++) {
            sum1 += arr[i];
        }
        double avg = (sum1/n);

        for (int i=0; i<n; i++) {
            diff[i] = (avg-arr[i]);
            num[i] = diff[i]*diff[i];
            sum2 += num[i];
        }

        // printing the standard deviation
        double result = Math.sqrt(sum2/n);
        System.out.println(result);
    }
}
