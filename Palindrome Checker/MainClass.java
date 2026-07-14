import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Palindrome obj = new Palindrome();

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        boolean result = obj.isPalindrome(num);

        if (result)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");

        sc.close();
    }
}
