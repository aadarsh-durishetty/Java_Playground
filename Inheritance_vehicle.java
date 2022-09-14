package workout;

import java.util.Scanner;

class vehicle{
    String vehicle_no;
    int mileage;

    void get_vehicle(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter vehicle no: ");
        vehicle_no = in.next();
        System.out.print("Enter vehicle mileage: ");
        mileage = in.nextInt();
    }
    void show(){
        System.out.println("Vehicle no: "+vehicle_no);
        System.out.println("vehicle mileage: "+mileage);
    }
}

class car extends vehicle{
    String company;
    String model;

    void get_car(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter car company: ");
        company = in.next();
        System.out.print("Enter car model: ");
        model = in.next();
    }
    void show(){
        System.out.println("Car company: "+company);
        System.out.println("Car model: "+model);
    }
}

class truck extends vehicle{
    String company;
    String model;

    void get_truck(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter truck company: ");
        company = in.next();
        System.out.print("Enter truck model: ");
        model = in.next();
    }
    void show(){
        System.out.println("Truck company: "+company);
        System.out.println("Truck model: "+model);
    }
}

public class Inheritance_vehicle {
    public static void main(String[] args) {
        truck t[] = new truck[3];
        car c[] = new car[3];

        for (int i=0; i<3; i++){
            c[i] = new car();
            c[i].get_car();
            c[i].get_vehicle();
        }
        for (int i=0; i<3; i++){
            t[i] = new truck();
            t[i].get_truck();
            t[i].get_vehicle();
        }
        System.out.println("Details of Car and Truck: ");
        for (int i=0; i<3; i++){
            c[i].show();
            t[i].show();
        }
        System.out.println("Car with mileage > 23: ");
        for (int i=0; i<3; i++){
            if (c[i].mileage > 23){
                System.out.println(c[i].company);
            }
        }
    }
}
