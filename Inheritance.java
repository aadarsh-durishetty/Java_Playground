package workout;

import java.util.Scanner;

class parent{
    String name;
    String desig;
    int age;

    void get1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = in.next();
        System.out.print("Enter the designation: ");
        desig = in.next();
        System.out.print("Enter the age: ");
        age = in.nextInt();
    }
    void show1(){
        System.out.println("Name: "+name);
        System.out.println("Designation: "+desig);
        System.out.println("Age: "+age);
    }
}
class child extends parent{
    String clg;
    String major;
    float cgpa;

    void get2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter college: ");
        clg = in.next();
        System.out.print("Enter major: ");
        major = in.next();
        System.out.print("Enter CGPA: ");
        cgpa = in.nextFloat();
    }
    void show2(){
        System.out.println("College: "+clg);
        System.out.println("Major: "+major);
        System.out.println("CGPA: "+cgpa);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        child c = new child();
        c.get1();c.get2();
        c.show1();c.show2();
        //parent p = new parent();
        //p.get1();p.show1();
    }

}
