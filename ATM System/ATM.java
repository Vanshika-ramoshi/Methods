public class ATM {

    double balance = 5000;

    void checkBalance() {
        System.out.println("Available Balance = " + balance);
    }

    void withdrawAmount(double amount) {

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println("Withdrawal Successful");
            System.out.println("Withdraw Amount = " + amount);
            System.out.println("Remaining Balance = " + balance);

        } else {

            System.out.println("Insufficient Balance");
        }
    }
}
