import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Prime obj = new Prime();

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        boolean result = obj.isPrime(num);

        if (result)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");

        sc.close();
    }
}
