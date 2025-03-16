package Q5;

import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("Temperature in Celsius: %.2f\n", celsius);
    }
}

