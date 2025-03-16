package Q9;

import java.util.Scanner;

public class Q_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double amount = principal * Math.pow(1 + (rate / 100), years);
        System.out.printf("The investment will grow to: %.2f\n", amount);
    }
}

