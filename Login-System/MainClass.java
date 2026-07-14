import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Login obj = new Login();

        System.out.print("Enter Username: ");
        String username = sc.next();

        System.out.print("Enter Password: ");
        String password = sc.next();

        boolean result = obj.login(username, password);

        if (result) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }

        sc.close();
    }
}
------------------------------------------------------------------------------------------------------
  Output :-
Enter Username: admin
Enter Password: 1234
Login Successful
