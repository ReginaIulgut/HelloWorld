package homeworks;

import java.util.Scanner;
import java.util.SortedMap;

public class Drafts {

    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a word, and check if it is palindrome
or not.
Palindrome: It is a word that is read the same backward as forward
•EX/ kayak, civic, madam
NOTE: Write a program that handles any String
NOTE: First check if the given String has at least 1 character, if the String
does not have at least one character, then print message “This word does
not have 1 or more characters”
Test data 1:
T
Expected output 1:
This word is palindrome
Test data 2:
civic
Expected output 2:
This word is palindrome
Test data 3:
Madam
Expected output 3:
This word is not palindrome
Test data 4:
Hello
Expected output 4:
This word is not palindrome
Test data 5:
Expected output 5:
This word does not have 1 or more characters
/*
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == word.charAt((word.length()-1)-i)) {
                System.out.println("This word is palindrome");
            }
            else {
                System.out.println("This word is not palindrome");
            }
        }

         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 10-------------------------");

        String originalWay, palindrome = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome");
        originalWay = in.nextLine();

        int length = originalWay.length();

        for (int m = length - 1; m >= 0; m--)
            palindrome = palindrome + originalWay.charAt(m);
        if(length <1 ) {
            System.out.println("The word does not have 1 or more characters");

        } else if (originalWay.equals(palindrome))
            System.out.println("The word is a palindrome.");
        else
            System.out.println("The word isn't a palindrome.");
    }
}
