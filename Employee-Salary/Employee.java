public class Employee {

    double calculateSalary(double basic) {

        double hra = basic * 0.20;   // 20% HRA
        double da = basic * 0.10;    // 10% DA

        return basic + hra + da;
    }
}
