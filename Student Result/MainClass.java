import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks 3: ");
        int m3 = sc.nextInt();

        Student obj = new Student();

        double percentage = obj.calculatePercentage(m1, m2, m3);

        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
