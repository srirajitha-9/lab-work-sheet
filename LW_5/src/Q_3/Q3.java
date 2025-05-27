package Q_3;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int N,N1;
        int num=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        N = scanner.nextInt();

        while (num<=10) {
            N1 = N * num;
            System.out.println(N + "*" + num + "=" + N1);
            num=num+1;


        }

    }
}
