package workout;

import java.util.Scanner;

class mobile{
    String model;
    String name;
    int price;
    int yr;

    void set_mobileDetails(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the model: ");
        String model = in.next();
        this.model = model;
        System.out.print("Enter the name: ");
        String name = in.next();
        this.name = name;
        System.out.print("Enter the price: ");
        int price = in.nextInt();
        this.price = price;
        System.out.print("Enter the MFG year: ");
        int yr = in.nextInt();
        this.yr = yr;
    }
    void get_modelDetails(){
        System.out.println("Model: "+model);
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("MFG year: "+yr);
    }

}
public class mobile_New_class {
    public static void main(String[] args) {
        mobile m[] = new mobile[2];
        mobile temp = new mobile();
        for (int i=0; i<2; i++){
            System.out.println("Enter the product "+(i+1)+" details");
            m[i] = new mobile();
            m[i].set_mobileDetails();
        }
        for (int i=0; i<(m.length-1); i++) {
            for (int j=0; j<(m.length-i-1); j++) {
                if (m[i].name.compareTo(m[j+1].name)>0) {
                    temp = m[j];
                    m[j] = m[j+1];
                    m[j+1] = temp;
                }
            }
        }
        for (int j=0; j<2; j++) {
            System.out.println("Sorted Product "+(j+1)+" details");
            m[j].get_modelDetails();
        }
    }
}

/*
import java.util.Scanner;
class Mobile{
    private String modelName;
    private String companyName;
    private double price;
    private String yearOfManufacture;
    public void set_mobileDetails(){
        Scanner ip=new Scanner (System.in);
        System.out.printf("Model Name = ");
        modelName=ip.next();
        System.out.printf("Company Name = ");
        companyName=ip.next();
        System.out.printf("Price = ");
        price=ip.nextDouble();
        System.out.printf("Year Of Manufacture = ");
        yearOfManufacture=ip.next();
    }
    public static void sort_mobileDetails(Mobile[] mob){
        for(int i=0;i<5;i=i+1){
            for(int j=i+1;j<5;j=j+1){
                if(((mob[i].companyName).compareTo(mob[j].companyName))>0){
                    String a=mob[i].modelName;
                    String b=mob[i].companyName;
                    double c=mob[i].price;
                    String d=mob[i].yearOfManufacture;
                    mob[i].modelName=mob[j].modelName;
                    mob[i].companyName=mob[j].companyName;
                    mob[i].price=mob[j].price;
                    mob[i].yearOfManufacture=mob[j].yearOfManufacture;
                    mob[j].modelName=a;
                    mob[j].companyName=b;
                    mob[j].price=c;
                    mob[j].yearOfManufacture=d;
                }
            }
        }
    }
    public void display_mobileDetails(){
        System.out.printf("Model Name = %s\n",modelName);
        System.out.printf("Company Name = %s\n",companyName);
        System.out.printf("Price = Rs %.2f\n",price);
        System.out.printf("Year Of Manufacture = %s\n",yearOfManufacture);
    }
}

public class mobile_class{
    public static void main(String[] args) {
        Mobile[] mob = new Mobile[5];
        for(int i=0;i<5;i=i+1){
            mob[i] = new Mobile();
        }
        for(int i=0;i<5;i=i+1){
            System.out.printf("\n\nMobile %d ::\n",i+1);
            mob[i].set_mobileDetails();
        }
        Mobile.sort_mobileDetails(mob);
        System.out.printf("\n\n** Sorted Order **\n");
        for(int i=0;i<5;i=i+1){
            System.out.printf("\n\nMobile %d ::\n",i+1);
            mob[i].display_mobileDetails();
        }
     }
 }
*/