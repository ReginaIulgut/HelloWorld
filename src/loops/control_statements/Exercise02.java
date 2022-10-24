package loops.control_statements;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 number between 0 and 10 included");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        for (int i = Math.min(num1,num2); i <= Math.max(num1,num2) ; i++) {
            if (i == 5) continue;
            System.out.println(i);
        }
    }
}
