import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Password obj = new Password();

        System.out.print("Enter Password: ");
        String password = sc.next();

        String result = obj.checkPassword(password);

        System.out.println(result);

        sc.close();
    }
}
