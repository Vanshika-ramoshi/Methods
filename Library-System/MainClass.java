import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library obj = new Library();

        System.out.print("Enter Book Name: ");
        String bookName = sc.next();

        System.out.print("Is Book Available (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        obj.issueBook(bookName, isAvailable);

        sc.close();
    }
}
