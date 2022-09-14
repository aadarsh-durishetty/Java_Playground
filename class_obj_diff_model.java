package workout;
import java.util.Scanner;

class college{
    String name;
    String fac[] = new String[2];
    int no_school;
    void set(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the college name: ");
        name = in.nextLine();
        for (int i=0; i<fac.length; i++){
            System.out.println("Enter the faculty "+(i+1)+" name");
            fac[i] = in.nextLine();
        }
        System.out.println("Enter no of schools: ");
        no_school = in.nextInt();
    }
    public static void display(college[] c){
        for (int i=0; i<c.length;i++){
            System.out.println(c[i].name);
            for (int j=0; j<c[i].fac.length; j++){
                System.out.println(c[i].fac[j]);
                System.out.println(c[i].no_school);
            }
        }
    }
    public static void largest(college[] c){
        System.out.println("The largest: ");
        for (college c1:c) {
            if (c1.no_school >= 5) {
                System.out.println(c1.name + c1.fac[0] + c1.fac[1] + c1.no_school);
            }
        }
    }
    public static void sort(college[] c){
        college temp = new college();
        System.out.println("The largest: ");
        for (int i=0; i<c.length;i++) {
            System.out.println(i + " ");
            for (int j = 0; j < c.length - i - 1; j++) {
                System.out.println(j + " ");
                if (c[j].name.compareTo(c[j + 1].name) > 0) {
                    temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
    }
}
public class class_obj_diff_model{
    public static void main(String[] args) {
        college v[] = new college[3];
        for (int i=0; i< v.length; i++){
            System.out.println("Enter the faculty details: ");
            v[i] = new college();
            v[i].set();
        }
        System.out.println("Before Sorting-------: ");
        college.display(v);
        college.largest(v);
        college.sort(v);
        System.out.println("After Sorting--------: ");
        college.display(v);
    }
}
