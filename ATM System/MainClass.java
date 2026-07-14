import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM obj = new ATM();

        obj.checkBalance();

        System.out.print("Enter Withdraw Amount: ");
        double amount = sc.nextDouble();

        obj.withdrawAmount(amount);

        obj.checkBalance();

        sc.close();
    }
}


Output : -     
Available Balance = 5000.0
Enter Withdraw Amount: 2000
Withdrawal Successful
Withdraw Amount = 2000.0
Remaining Balance = 3000.0
Available Balance = 3000.0
