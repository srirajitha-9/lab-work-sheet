package Q4;
import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        int year;

        Scanner scanner = new Scanner (System.in);
            System.out.println(" Enter the year : ");
            year = scanner.nextInt();
            scanner.close();


            if ((year % 4==0 && year % 100!=0)|| (year % 400==0 )){
                System.out.println("This is a Leap year");

            }else {
                System.out.println(" this is not a Leap year");
            }


    }
}
