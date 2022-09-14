/*
package workout;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = in.nextInt();
        int stars = 0;
        int spaces = 0;
        for (int i = 0; i < n; i++) {
            spaces = n - i - 1;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            stars = n - spaces;
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}*/

/*
package workout;
import java.util.Scanner;
import java.util.Arrays;
public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String arr[] = new String[5];
        for (int i=0; i<5; i++){
            arr[i] = in.next();
        }
        for (int i=0; i<5; i++){
            Arrays.sort(arr);
        }
        for (int i=0; i<5; i++){
            System.out.println(arr[i]);
        }
    }
}
*/

/*
package workout;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        int k = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Repeated no: " + arr[i]);
                }
            }
        }
    }
}*/

/*
package workout;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String txt = in.nextLine();
        String arr[] = txt.split(" ");

        for(int i=0; i<arr.length; i++){
            for(int j=arr[i].length()-1; j>=0; j--){
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}*/



/*
package workout;
import java.util.Scanner;

class acc{
    double bal;
    float anr;

    public boolean withdraw(double amount){
        if(bal>amount){
            bal=bal-amount;
            return true;
        }
        else{
            System.out.println("Insufficient funds");
            return false;
        }
    }
    public void deposit(double amount){
        bal=bal+amount;
    }
    public void set(){
        Scanner in = new Scanner(System.in);
        System.out.print("balance: ");
        bal = in.nextDouble();
        System.out.print("anr: ");
        anr = in.nextFloat();
    }
    public void get(){
        System.out.println("balance: "+bal);
        System.out.println("anr: "+anr);
    }
}
public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        acc a = new acc();
        a.set();
        System.out.println("1-withdraw, 2-deposit, 3-view account");
        int choice = in.nextInt();
        while(choice==1||choice==2||choice==3) {
            if (choice == 1) {
                System.out.print("enter withdraw amount: ");
                double amt = in.nextDouble();
                a.withdraw(amt);
            }
            if (choice == 2) {
                System.out.print("enter the deposit amount: ");
                double amt = in.nextDouble();
                a.deposit(amt);
            }
            if (choice == 3) {
                a.get();
            }
            System.out.println("choice: ");
            choice = in.nextInt();
        }

    }
}
*/



/*
package workout;
import java.util.Scanner;

class info{
    String company;
    String model;
    String mfg;
    int price;

    public void set(){
        Scanner in = new Scanner(System.in);
        System.out.print("company: ");
        company = in.next();
        System.out.print("model: ");
        model = in.next();
        System.out.print("mfg date: ");
        mfg = in.next();
        System.out.print("price: ");
        price = in.nextInt();
    }
    public void get(){
        System.out.println("company: "+company);
        System.out.println("model: "+model);
        System.out.println("mfg date: "+mfg);
        System.out.println("price: "+price);
    }
    public void checkcompany(){
        if(company.equals("samsung")){
            System.out.println("company: "+company);
            System.out.println("model: "+model);
            System.out.println("mfg date: "+mfg);
            System.out.println("price: "+price);
        }
    }
    public void checkdate(){
        if(mfg.contains("2012")||mfg.contains("2013")||
                mfg.contains("2014")||mfg.contains("2015")||
        mfg.contains("2016")||mfg.contains("2017")||
        mfg.contains("2018")||mfg.contains("2019")){
            System.out.println("company: "+company);
            System.out.println("model: "+model);
            System.out.println("mfg date: "+mfg);
            System.out.println("price: "+price);
        }
    }
    public void checkprice(){
        if(price>10000){
            System.out.println("company: "+company);
            System.out.println("model: "+model);
            System.out.println("mfg date: "+mfg);
            System.out.println("price: "+price);
        }
    }

}
public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        info data[] = new info[2];
        for(int i=0; i<2; i++){
            data[i] = new info();
        }
        for(int i=0; i<2; i++){
            data[i].set();
        }
        for(int i=0; i<2; i++){
            System.out.println("Products of samsung company: ");
            data[i].checkcompany();
        }
        for(int i=0; i<2; i++){
            System.out.println("products of valid date: ");
            data[i].checkdate();
        }
        for(int i=0; i<2; i++){
            System.out.println("products of price < 10000");
            data[i].checkprice();
        }
    }
}
*/

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
public class practice{
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

/*
package workout;
import java.util.Scanner;

class data{
    String name;
    String model;
    int mfg;
    int price;

    public void set(){
        Scanner in = new Scanner(System.in);
        System.out.print("name: ");
        name = in.next();
        System.out.print("model: ");
        model = in.next();
        System.out.print("mfg: ");
        mfg = in.nextInt();
        System.out.print("price: ");
        price = in.nextInt();
    }

    public static void sort(data[] d){
        for(int i=0; i<3; i++){
            for(int j=i+1; j<3; j++){
                if(d[i].name.compareTo(d[j].name)<0){
                    String w = d[i].name;
                    String x = d[i].model;
                    int y = d[i].mfg;
                    int z = d[i].price;
                    d[i].name = d[j].name;
                    d[i].model = d[j].model;
                    d[i].mfg = d[j].mfg;
                    d[i].price = d[j].price;
                    d[j].name = w;
                    d[j].model = x;
                    d[j].mfg = y;
                    d[j].price = z;
                }
            }
        }
    }
    public void get(){
        System.out.println("name: "+name);
        System.out.println("model: "+model);
        System.out.println("mfg: "+mfg);
        System.out.println("price: "+price);
    }

}
public class practice{
    public static void main(String[] args) {
        data d[] = new data[3];
        for (int i=0; i<3; i++){
            d[i] = new data();
        }
        for (int i=0; i<3; i++){
            d[i].set();
        }
        data.sort(d);
        for (int i=0; i<3; i++){
            d[i].get();
        }
    }
}
 */



/*
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

public class practice {
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
*/
