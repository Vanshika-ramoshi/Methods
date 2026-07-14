import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Grade obj = new Grade();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        char grade = obj.getGrade(marks);

        System.out.println("Grade = " + grade);

        sc.close();
    }
}
