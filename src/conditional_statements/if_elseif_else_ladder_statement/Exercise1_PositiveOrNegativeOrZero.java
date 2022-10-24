package conditional_statements.if_elseif_else_ladder_statement;

import java.util.Scanner;

public class Exercise1_PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = input.nextInt();
        if (number < 0){
            System.out.println("NEGATIVE");
        }
        else if (number == 0){
        System.out.println("ZERO");
    }
    else{
            System.out.println("POSITIVE");
    }
        }
}
