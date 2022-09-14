package workout;
import java.util.Scanner;

class Product {
    String id;
    String name;
    int serno;
    String company;
    String date;
    int price;

    void setdata() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the id: ");
        String id = in.next();
        this.id =id;
        System.out.print("Enter the name: ");
        String name = in.next();
        this.name = name;
        System.out.print("Enter the serial no: ");
        int serno = in.nextInt();
        this.serno = serno;
        System.out.print("Enter the company: ");
        String company = in.next();
        this.company = company;
        System.out.print("Enter the date: ");
        String date = in.next();
        this.date = date;
        System.out.print("Enter the price: ");
        int price = in.nextInt();
        this.price = price;

    }
    void getdata() {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Serial No: "+serno);
        System.out.println("Company: "+company);
        System.out.println("Date: "+date);
        System.out.println("Price: "+price);
    }
}

    public class products_class {
        public static void main(String[] args) {
            Product p[] = new Product[5];
            // to get the data from user.
            for (int i=0; i<5; i++) {
                System.out.println("Enter product " + (i + 1) + " details: ");
                p[i] = new Product();
                p[i].setdata();
            }
            // to display the samsung product details.
            for (int i=0; i<5; i++) {
                if (p[i].name.equals("samsung")) {
                    System.out.println("Product: " + (i + 1) + " details: ");
                    p[i].getdata();
                }
            }
            // to display the details during MFG year 2012 to 2019.
            for (int i=0; i<5; i++){
                if (p[i].date.contains("2012")||p[i].date.contains("2013")
                        ||p[i].date.contains("2014")||p[i].date.contains("2015")
                        ||p[i].date.contains("2016")||p[i].date.contains("2017")
                        ||p[i].date.contains("2018")||p[i].date.contains("2019")){
                    System.out.println("Product: " + (i + 1) + " details: ");
                    p[i].getdata();
                }
            }
            // to display product details whose price > 10000.
            for (int i=0; i<5; i++){
                if (p[i].price > 10000){
                    System.out.println("Product: " + (i + 1) + " details: ");
                    p[i].getdata();
                }
            }
            // to display the product details with laptop in its name.
            for (int i=0; i<5; i++){
                if (p[i].name.contains("laptop")){
                    System.out.println("Product: " + (i + 1) + " details: ");
                    p[i].getdata();
                }
            }
        }
    }


/*
import java.util.Scanner;
class Products{
    private String id;
    private String name;
    private int serialNumber;
    private String company;
    private String manufacturedDate;
    private int price;
    public void setData(){
        Scanner ip=new Scanner (System.in);
        System.out.printf("Id = ");
        id=ip.next();
        System.out.printf("Name = ");
        name=ip.next();
        System.out.printf("Serial Number = ");
        serialNumber=ip.nextInt();
        System.out.printf("Company = ");
        company=ip.next();
        System.out.printf("Manufactured Date = ");
        manufacturedDate=ip.next();
        System.out.printf("Price = ");
        price=ip.nextInt();
    }
    public void samsungManufactured(){
        if(company.equals("Samsung")){
            System.out.printf("\nId = %s\n",id);
            System.out.printf("Name = %s\n",name);
            System.out.printf("Serial Number = %d\n",serialNumber);
            System.out.printf("Company = %s\n",company);
            System.out.printf("Manufactured Date = %s\n",manufacturedDate);
            System.out.printf("Price = %d\n",price);
        }
    }
    public void manufacturedDate(){
        int i=Integer.parseInt(manufacturedDate.substring(manufacturedDate.length()-4));
        if((2012<=i)&&(i<=2019)){
            System.out.printf("\nId = %s\n",id);
            System.out.printf("Name = %s\n",name);
            System.out.printf("Serial Number = %d\n",serialNumber);
            System.out.printf("Company = %s\n",company);
            System.out.printf("Manufactured Date = %s\n",manufacturedDate);
            System.out.printf("Price = %d\n",price);
        }
    }
    public void Price(){
        if(price>10000){
            System.out.printf("\nId = %s\n",id);
            System.out.printf("Name = %s\n",name);
            System.out.printf("Serial Number = %d\n",serialNumber);
            System.out.printf("Company = %s\n",company);
            System.out.printf("Manufactured Date = %s\n",manufacturedDate);
            System.out.printf("Price = %d\n",price);
        }
    }
    public void laptop(){
        if(name.equals("Laptop")){
            System.out.printf("\nId = %s\n",id);
            System.out.printf("Name = %s\n",name);
            System.out.printf("Serial Number = %d\n",serialNumber);
            System.out.printf("Company = %s\n",company);
            System.out.printf("Manufactured Date = %s\n",manufacturedDate);
            System.out.printf("Price = %d\n",price);
        }
    }
}
public class products{
    public static void main(String[] args) {
        Products[] products = new Products[5];
        for(int i=0;i<5;i=i+1){
            products[i] = new Products();
        }
        for(int i=0;i<5;i=i+1){
            System.out.printf("\n\nProduct - %d ::\n",i+1);
            products[i].setData();
        }
        System.out.printf("\n\nProducts Manufactured by Samsung :: \n");
        for(int i=0;i<5;i=i+1){
            products[i].samsungManufactured();
        }
        System.out.printf("\n\nProducts Manufactured between year 2012 and 2019 :: \n");
        for(int i=0;i<5;i=i+1){
            products[i].manufacturedDate();
        }
        System.out.printf("\n\nProducts Price greater than 10000:: \n");
        for(int i=0;i<5;i=i+1){
            products[i].Price();
        }
        System.out.printf("\n\nProducts that are Laptop:: \n");
        for(int i=0;i<5;i=i+1){
            products[i].laptop();
        }
    }
}
*/
