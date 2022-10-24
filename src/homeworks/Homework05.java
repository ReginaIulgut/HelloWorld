package homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nTASK-1\n");
        String result = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) result += i + " - ";
        }
        System.out.println(result.substring(0, result.length()-3));

        System.out.println("\nTASK-2\n");
        String result1 = "";
        for (int j = 1; j <= 50; j++) {
            if (j % 6 == 0) result1 += j + " - ";
        }
        System.out.println(result1.substring(0, result1.length()-3));

        System.out.println("\nTASK-3");
        String result2 = "";
        for (int k = 100; k >= 50; k--) {
            if (k % 5 == 0) result2 += k + " - ";
        }
        System.out.println(result2.substring(0, result2.length()-3));

        System.out.println("\nTASK-4\n");
        int start = 0;
        while (start <= 7){
            System.out.println("The square of " + start + " is = " + start * start);
            start ++;
        }

        System.out.println("\nTASK-5\n");
        int sum = 0;
        for (int l = 1; l <= 10; l++) {
            sum = sum + l;
        }
        System.out.println(sum);

        System.out.println("\nTASK-6\n");
        System.out.println("Please enter positive number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        int n = 1;
        int factorial = 1;
        while (n <= num){
            factorial = factorial * n;
            n++;}
        System.out.println(factorial);

        System.out.println("\nTASK-7\n");
        System.out.println("Please enter your full name: ");
        String fullName = scanner.nextLine();
        int counter = 0;
        int fullNameLength = fullName.length();
        for (int i = 0; i < fullNameLength; i++) {
            fullName = fullName.toLowerCase();
            char c = fullName.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' ||
                    c == 'o' || c == 'u') ;
            counter++;
        }
        System.out.println("There are " + counter + " vowel letters in this full name");

        System.out.println("\nTASK-8\n");
        int input =0;
        int sum1 = 0;

        do {
            System.out.println("Hey User Enter number: ");
            input = scanner.nextInt();
            if (input >= 100) {
                System.out.println("Number is already more than 100");
                break;
            }
            if (sum1 + input <= 100)
                sum1 += input;

        } while (sum1 < 100);
        System.out.println("Sum of the entered numbers is at least 100");

        System.out.println("\nTASK-9\n");
        int count = 7, num1 = 0, num2 = 1;
        for (int m = 1; m <= count; ++m) {
            System.out.println(num1 + " ");
            /*
            On each iteration, we are assigning second number to the second number and assigning the sum of last
            two numbers to the second
             */
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }

        System.out.println("\nTASK-10\n");
        System.out.println("Please enter a name: ");
        String name = scanner.nextLine();
        while (name.toLowerCase().charAt(0) != 'j'){
            System.out.println("Please enter a name");
            name = scanner.nextLine();
        }
        System.out.println("End of the program");
        }
}
