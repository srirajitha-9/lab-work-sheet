package Q7;

import java.util.Scanner;

public class Q_7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height / 100, 2);
        System.out.printf("Your BMI is: %.2f\n", bmi);
    }
}

