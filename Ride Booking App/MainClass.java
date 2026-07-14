import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RideBooking obj = new RideBooking();

        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();

        double fare = obj.calculateFare(distance);

        System.out.println("Total Fare = " + fare);

        sc.close();
    }
}
