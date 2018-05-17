package Task1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.print("Enter a word to check: ");
        String string = new Scanner(System.in).next();
        
        String result = palindromeDetection(string);
        System.out.println(result);
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
