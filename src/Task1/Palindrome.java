package Task1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String string;
        String answer;

        do {
            System.out.print("Enter a word to check: ");
            string = new Scanner(System.in).next();

            String result = palindromeDetection(string);
            System.out.println(result);

            System.out.print("Would you like to continue (Yes/No): ");
            answer = new Scanner(System.in).next();
        } while (answer.equals("Yes") || answer.equals("yes"));
        System.out.println("Thank you for your trust in us!!!");
    }

    private static String palindromeDetection(String string) {

        String temp = "";
        for(int i = string.length() - 1; i >= 0; i--) {
            temp += string.charAt(i);
        }

        return temp.equals(string)
                ? "is palindrome" : "isn't palindrome";
    }
}
