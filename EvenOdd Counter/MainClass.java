import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EvenOdd obj = new EvenOdd();

        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Array Elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        obj.countEvenOdd(arr);

        sc.close();
    }
}
