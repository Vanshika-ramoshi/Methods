import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee obj = new Employee();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double totalSalary = obj.calculateSalary(basic);

        System.out.println("Total Salary = " + totalSalary);

        sc.close();
    }
}


Output :-
Enter Basic Salary: 30000
Total Salary = 39000.0
