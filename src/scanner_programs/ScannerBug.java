package scanner_programs;

import java.util.Scanner;

public class ScannerBug {
    public static void main(String[] args) {
        /*
        age = 25
        address = 123 street Miami
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter age");
        int age = scanner.nextInt(); // or next(), nextByte(), nextDouble()

        scanner.nextLine(); // moving cursor to the next line of input

        System.out.println("Please enter your address");
        String address = scanner.nextLine();

        System.out.println("Age is = " + age);
        System.out.println("Address is = " + address);
    }
}
