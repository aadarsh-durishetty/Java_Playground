package workout;
import java.util.Scanner;

class superclass{
    int a;
    superclass(int a){
        this.a = a;
        System.out.println("Invoked variables of superclass: "+a);
    }
}

class subclass extends superclass{
    int b;
    subclass(int a, int b){
        super(a);
        this.b = b;
        System.out.println("Invoked variables of subclass: "+a+" "+b);
    }
}

class subsubclass extends subclass{
    int c;
    subsubclass(int a, int b, int c){
        super(a,b);
        this.c = c;
        System.out.println("Invoked variables of subsubclass: "+a+" "+b+" "+c);
    }
}

public class Inheritance_constructors{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integers a,b,c: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        subsubclass s2 = new subsubclass(a,b,c);
        subclass s1 = new subclass(a,b);
        superclass s = new superclass(a);

    }
}
