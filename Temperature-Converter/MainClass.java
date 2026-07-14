import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Temperature obj = new Temperature();

        System.out.print("Enter Temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = obj.celsiusToFahrenheit(celsius);

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);

        sc.close();
    }
}
---------------------------------------------------------------------------------------------------------
  OUTPUT :-
  Enter Temperature in Celsius: 30
  Temperature in Fahrenheit = 86.0
