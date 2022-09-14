package workout;
import java.util.Scanner;
public class string_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the country name: ");
        String s = in.nextLine();

        switch(s){
            case "India":
                System.out.println("Currency: Rupee");
                break;
            case "America":
                System.out.println("Currency: Dollar");
                break;
            case "Bangladesh":
                System.out.println("Currency: Taka");
                break;
            case "Bhutan":
                System.out.println("Currency: Ngultrum");
                break;
            case "Myanmar":
                System.out.println("Currency: Kyat");
                break;
            case "Italy":
                System.out.println("Currency: Euro");
                break;
            case "United Kingdom":
                System.out.println("Currency: Pound");
                break;
            default:
                System.out.println("Enter valid country name");
                break;
        }
    }
}
