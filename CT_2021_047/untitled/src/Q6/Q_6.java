package Q6;

import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        int birthYear = scanner.nextInt();

        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.printf("You were born in %d and are %d years old this year.\n", birthYear, age);
    }
}

