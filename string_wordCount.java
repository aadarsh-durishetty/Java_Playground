
package workout;
import java.util.Scanner;
public class string_wordCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sen = in.nextLine();
        System.out.print("Enter the string to be searched: ");
        String word = in.next();
        int count=0;
        String arr[] = sen.split(" ");

        for (int i=0; i<arr.length; i++){
            if(arr[i].equals("India")){
                count++;
            }
        }
        System.out.println("The word "+word+" repeated "+count+" times in sentence");
    }
}






















