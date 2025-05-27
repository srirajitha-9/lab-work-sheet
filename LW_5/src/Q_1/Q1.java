package Q_1;

public class Q1 {
    public static void main(String[] args) {
        int num =10;
        int count =0;

        do {
            System.out.print(num+ " ");
            num = num+1;
            count =count+1;
            if (count%10==0){
                System.out.println();
            }

        }while(count<40);

    }
}

