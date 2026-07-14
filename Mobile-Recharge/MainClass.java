import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Recharge obj = new Recharge();

        System.out.print("Enter Recharge Amount: ");
        double amount = sc.nextDouble();

        obj.recharge(amount);

        sc.close();
    }
}
