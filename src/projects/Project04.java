package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nTASK-1\n");

        System.out.println("Please enter a String");
        String str = scanner.nextLine();
        if (str.length() < 8) {
            System.out.println("This String does not have 8 characters");
        }
        else {
            System.out.println(str.substring(str.length() - 4) + str.substring(4, str.length() - 4) + str.substring(0, 4));
        }

        System.out.println("\nTASK-2\n");

        System.out.println("Please enter a sentence ");
        String sentence = scanner.nextLine();
        if (!sentence.contains(" ")) System.out.println("This sentence does not have 2 or more words to swap");
        else {
            System.out.println(sentence.substring(sentence.lastIndexOf(' ') + 1, sentence.length()) +
                    sentence.substring(sentence.indexOf(' '), sentence.lastIndexOf(' ')) + " " +
                    sentence.substring(0, sentence.indexOf(' ')));
        }

        System.out.println("\nTASK-3\n");

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot\n" +
                "look shoes";
        if (str3.contains("stupid") || str1.contains("idiot")){
            str3 = str3.replace("stupid", "nice");
            str3 = str3.replace("idiot", "amazing");
        }
        System.out.println(str3);

        System.out.println("\nTASK-4\n");

        String name = ScannerHelper.getAName();
        if (name.length() > 2) {
            if (name.length() % 2 == 0)
                System.out.println(name.substring(name.length()/2-1, name.length()/2+1));
            else System.out.println(name.charAt(name.length()/2));
        }else {
            System.out.println("Invalid input!!!");
        }

        System.out.println("\nTASK-5\n");

        System.out.println("Please enter a country");
        String country = scanner.nextLine();
        if (country.length() >= 5) System.out.println(country.substring(2, country.length()-2));
        else System.out.println("Invalid input!!!");

        System.out.println("\nTASK-6\n");

        String address = ScannerHelper.getAnAddress();
        if (address.toLowerCase().contains("a"))
            address = address.toLowerCase().replace("a", "*");
        if (address.toLowerCase().contains("e"))
            address = address.toLowerCase().replace("e", "#");
        if (address.toLowerCase().contains("i"))
            address = address.toLowerCase().replace("i", "+");
        if (address.toLowerCase().contains("u"))
            address = address.toLowerCase().replace("u", "$");
        if (address.toLowerCase().contains("0"))
            address = address.toLowerCase().replace("a", "@");
        System.out.println(address);

        System.out.println("\nTASK-7\n");

        int randomNum1 = (int)(Math.random() * 26);
        int randomNum2 = (int)(Math.random() * 26);
        String result = "";
        for (int i = Math.min(randomNum1, randomNum2); i <= Math.max(randomNum1, randomNum2) ; i++) {
            if (i % 5 != 0) result += i + " - ";
        }
        System.out.println(result.substring(0, result.length()-3));

        System.out.println("\nTASK-8\n");

        System.out.println("Please enter a sentence ");
        String sentenceForTask08 = scanner.nextLine();
        int countWords = 1;
        if (!sentenceForTask08.contains(" ")) {
            System.out.println("This sentence does not have multiple words");
        } else {
            for (int i = 0; i < sentenceForTask08.length(); i++) {
                if (sentenceForTask08.charAt(i) == ' ') countWords++;
            }
            System.out.println("This sentence has " + countWords + " words");
        }

        System.out.println("\nTASK-9\n");

        System.out.println("Please enter a positive number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }

        System.out.println("\nTASK-10\n");

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

        System.out.println("\nTASK-11\n");

        int countA = 0;
        System.out.println("Please enter a sentence ");
        String strForTask11 = scanner.nextLine();
        if (strForTask11.length() < 1) System.out.println("This sentence does not have any characters.");
        else {
            for (int i = 0; i < strForTask11.length(); i++) {
                if (strForTask11.charAt(i) == 'a' || strForTask11.charAt(i) == 'A') countA++;
            }
        }
        System.out.println("This sentence has " + countA + " a or A letters");

    }
}
