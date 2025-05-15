package Q1;
import java.util.Scanner;


public class Q_1 {
    public static void main(String[] args) {

        int smallest;

        System.out.println("enter a value to a:");
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println("enter a value to b:");
        int b = scanner. nextInt();
        System.out.println("enter a value to c:");
        int c = scanner.nextInt();



        if (a>b){

            if (b>c){
                System.out.println("the smallest no is: c =" + c);

            }else {
                System.out.println("the smallest no is: b =" + b);

            }

        }else {
            if (a>c){
                System.out.println("the smallest no is: c =" + c);

            }else {
                System.out.println("the smallest no is: a =" + a);
            }
        }
    }
}


