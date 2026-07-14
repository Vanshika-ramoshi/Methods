import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Electricity obj = new Electricity();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double bill = obj.calculateBill(units);

        System.out.println("Electricity Bill = " + bill);

        sc.close();
    }
}
