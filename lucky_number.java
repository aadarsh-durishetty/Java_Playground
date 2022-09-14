package workout;
import java.util.Scanner;
import java.lang.String;
public class lucky_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any five digit number: ");
        int num = in.nextInt();

        String s = Integer.toString(num);

        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = Character.getNumericValue(s.charAt(i));
        }

        if ((arr[0] + arr[1] + arr[2]) == (arr[3] + arr[4])) {
            System.out.println("Lucky number");
        } else {
            System.out.println("Not a lucky number");
        }

    }
}

// alternate code:
/*
if num = 12345 is five digit number
then;
e = num%10
d = (num/10)%10
c = (num/100)%10
b = (num/1000)%10
a = (num/10000)%10
now, can directly check the conditions.
 */
