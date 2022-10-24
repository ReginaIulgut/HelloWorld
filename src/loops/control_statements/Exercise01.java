package loops.control_statements;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        for (int i = Math.max(num1,num2); i >= Math.min(num1,num2) ; i--) {
            if (i < 10) break;
            System.out.println(i);

        }
    }
}
