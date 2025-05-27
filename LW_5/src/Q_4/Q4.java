package Q_4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        int py;
        int i, j;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        py = scanner.nextInt();

        for (i = 1; i <= py; i++) {
            for (j = 1; j <= py - i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
