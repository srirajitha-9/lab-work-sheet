package Q_5;

import java.util.Scanner;


public class Q5 {
    public static void main(String[] args) {

        String word;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word or phrase: ");
        word = scanner.nextLine();
        if (isPalindrome(word)){
            System.out.println("the word is palindrome");
        }else{
            System.out.println("the word is not palindrome");
        }
        scanner.close();
    }
    public static boolean isPalindrome(String word){
        String reverseWord ="";
        for (int i = word.length()-1; i>=0; i--){
            reverseWord= reverseWord + word.charAt(i);
        }
        return word.equals(reverseWord);
    }
}