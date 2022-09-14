package workout;
import java.util.Scanner;

abstract class shape{
    float pi = 3.14f;
    abstract void volume();
}

class sphere extends shape{
    float r;
    sphere(float r){
        this.r = r;
    }
    void volume(){
        float vol = (4/3*pi*r*r);
        System.out.println("Volume of sphere: "+vol);
    }
}
class cylinder extends shape{
    float r,h;
    cylinder(float r, float h){
        this.r = r;
        this.h = h;
    }
    void volume(){
        float vol = (pi*r*r*h);
        System.out.println("Volume of cylinder: "+vol);
    }
}
class cone extends shape{
    float r,h;
    cone(float r, float h){
        this.r = r;
        this.h = h;
    }
    void volume(){
        float vol = ((1/3f)*pi*r*r*h);
        System.out.println("Volume of cone: "+vol);
    }
}
class cube extends shape{
    float s;
    cube(float s){
        this.s = s;
    }
    void volume(){
        float vol = (s*s*s);
        System.out.println("Volume of cube: "+vol);
    }
}

public class Abstract_class{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = in.nextInt();
        System.out.print("Enter the height: ");
        int h = in.nextInt();
        System.out.print("Enter the side: ");
        int s = in.nextInt();
        System.out.println("Sphere: ");
        sphere sp = new sphere(r);
        sp.volume();
        System.out.println("Cylinder: ");
        cylinder cy = new cylinder(r,h);
        cy.volume();
        System.out.println("Cone: ");
        cone co = new cone(r,h);
        co.volume();
        System.out.println("Cube: ");
        cube cu = new cube(s);
        cu.volume();
    }
}

