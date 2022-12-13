package exception_handling.try_catch;

import utilities.ScannerHelper;

import java.util.Scanner;

public class TryCatch_Practice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        try {
            System.out.println(num1 / num2);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("End of the program");
    }

    public static void printFrom1 (int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
