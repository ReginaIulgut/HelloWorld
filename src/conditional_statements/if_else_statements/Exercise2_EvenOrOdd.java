package conditional_statements.if_else_statements;

import java.util.Scanner;

public class Exercise2_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("The number you entered is even!");
        }
        else{
            System.out.println("The number you entered is odd!");
        }
        System.out.println("End of the program");
    }
}
