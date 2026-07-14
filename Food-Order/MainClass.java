import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodOrder obj = new FoodOrder();

        System.out.print("Enter Item Name: ");
        String item = sc.next();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        obj.placeOrder(item, quantity);

        sc.close();
    }
}
