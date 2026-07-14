import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank obj = new Bank();

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (Years): ");
        int time = sc.nextInt();

        double interest = obj.calculateInterest(principal, rate, time);

        System.out.println("Interest = " + interest);

        sc.close();
    }
}
