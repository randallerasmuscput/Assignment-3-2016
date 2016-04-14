package Assignment3;

/**
 * Hello world!
 *
 */
public class Employee implements employeeInterface {
    public int hourlyRate(int rate)
    {
        return rate * 20;
    }

    public double department(String dept) {

        double result = 0.0;

        if (dept == "hr") {
            result = 500;
        } else {
            result = 1000;
        }
        return result;
    }
}