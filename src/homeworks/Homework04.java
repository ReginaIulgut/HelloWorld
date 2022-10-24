package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        System.out.println("\nTASK-1\n");
        String name = ScannerHelper.getAName();
        System.out.println("The length of the name is = " + name.length() +
        "\nThe first character in the name is = " + name.charAt(0) +
        "\nThe last character in the name is = " + name.charAt(name.length() - 1) +
        "\nThe first 3 characters in the name is = " + name.substring(0,3) +
        "\nThe last 3 characters in the name is = " + name.substring(name.length()-3));
        String nameWithA = name.startsWith("a") || name.startsWith("A") ?
                "You are in the club!": "Sorry, you are not in the club";
        System.out.println(nameWithA);

        System.out.println("\nTASK-2\n");
        String address = ScannerHelper.getAnAddress();
        if (address.toLowerCase().contains("chicago")){
            System.out.println("You are in the club");
        } else if (address.toLowerCase().contains("des plaines")){
            System.out.println("You are welcome to join the club");
        } else {
            System.out.println("Sorry, you will never be in the club");
        }

        System.out.println("\nTASK-3\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter at least 4 favorite colors");
        String fav4Colors = input.nextLine();
        if (fav4Colors.toLowerCase().contains("green") && fav4Colors.toLowerCase().contains("red")){
            System.out.println("Green and red are in the list");
        } else if (fav4Colors.toLowerCase().contains("green")){
            System.out.println("Green in the list");
        }else if (fav4Colors.toLowerCase().contains("red")) {
            System.out.println("Red in the list");
        } else{
            System.out.println("Green and red are not in the list");
        }

        System.out.println("\nTASK-4\n");
        String str = "Java is FUN  ";
        String firstWord = str.trim().toLowerCase().substring(0,4);
        String secondWord = str.trim().toLowerCase().substring(5,7);
        String thirdWord = str.trim().toLowerCase().substring(8,11);
        System.out.println("The first word in the str is = " + firstWord +
                "\nThe second word in the str is = " + secondWord +
                "\nThe third word in the str is = " + thirdWord);
    }
}
