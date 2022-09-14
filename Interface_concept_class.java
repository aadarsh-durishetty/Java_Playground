package workout;
import java.util.Scanner;

interface courseTotal{
    int total();
}

interface courseAverage{
    String average();
}

public class Interface_concept_class implements courseTotal, courseAverage{
    Scanner in = new Scanner(System.in);
    public String average(){
        int sum = total();
        int avg = sum/5;
        if(avg >= 60)
            return "First";
        else if(avg >= 50)
            return "Second";
        else
            return "Fail";
    }
    public int total(){
        int sum = 0;
        for (int i=0; i<5; i++){
            System.out.println("Enter the marks of subject: "+(i+1));
            sum += in.nextInt();
        }
        return sum;
    }
    public static void main(String [] args){
        Interface_concept_class r = new Interface_concept_class();
        System.out.println(r.average());
    }
}
