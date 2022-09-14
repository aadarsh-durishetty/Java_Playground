// to count no of digits and vowels

package workout;
import java.util.Scanner;
public class string_vowels_digits {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = in.nextLine();
        int vowels=0, digits=0;
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowels++;
            }
        }
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) > 48 && s.charAt(i) < 57 ){
                digits++;
            }
        }
        System.out.println("The no of vowels: "+vowels);
        System.out.println("The no of digits: "+digits);
    }
}
