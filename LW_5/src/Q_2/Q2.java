package Q_2;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int num;

                System.out.println("Enter a number :");

                num = scanner.nextInt();

                while (num >= 0) {
                    System.out.println(num + " has " + countDigits(num) + " digits.");

                    System.out.println("Enter another number :");
                    num = scanner.nextInt();
                }

                scanner.close();
                System.out.println("Program terminated.");
            }

            // Method to count digits
            public static int countDigits(int number) {
                return String.valueOf(Math.abs(number)).length();
    }
}