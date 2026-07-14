import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ShoppingCart obj = new ShoppingCart();

        System.out.print("Enter Price 1: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter Price 2: ");
        double price2 = sc.nextDouble();

        System.out.print("Enter Price 3: ");
        double price3 = sc.nextDouble();

        double total = obj.calculateTotal(price1, price2, price3);

        System.out.println("Total Amount = " + total);

        sc.close();
    }
}
