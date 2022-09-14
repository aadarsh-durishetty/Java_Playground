package workout;

import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(string_vowels_digits[] args) {
        System.out.print("Enter size of array: ");
        Scanner in = new Scanner(System.in);
        int k=0;
        int len = in.nextInt();
        int []arr1 = new int[len];
        int []arr2 = new int[len];

        for(int i=0; i<len; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.println("Sorted Array: ");
        for (int i=0; i<len; i++) {
            Arrays.sort(arr1);
        }

        for (int j = 0; j < len; j++) {
            if (arr1[j] % 2 != 0) {
                arr2[k] = arr1[j];
                k++;
            }
        }
        for (int j = 0; j < len; j++) {
            if (arr1[j] % 2 == 0) {
                arr2[k] = arr1[j];
                k++;
            }
        }
        System.out.println("out-put");

        for (int i = 0; i < len; i++) {
            System.out.println(arr2[i]);
        }


    }
}
