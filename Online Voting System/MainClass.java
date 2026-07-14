import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Voting obj = new Voting();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        obj.vote(age);

        sc.close();
    }
}
