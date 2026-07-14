import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ECommerce obj = new ECommerce();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        double finalPrice = obj.calculateDiscount(price);

        System.out.println("Final Price after Discount --> " + finalPrice);

        sc.close();
    }
}
