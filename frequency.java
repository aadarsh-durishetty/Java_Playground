package workout;
import java.util.Scanner;
public class frequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        int []arr = new int [n];
        int []freq = new int [n];

        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        int found = -1;
        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                    //To avoid counting same element again
                    freq[j] = found;
                }
            }
            if(freq[i] != found)
                freq[i] = count;
        }

        //Displays the frequency of each element present in array
        for(int i = 0; i < n; i++){
            if(freq[i] != found)
                System.out.println(arr[i]+" - occurs "+freq[i]+ " times.");
        }
    }
}


