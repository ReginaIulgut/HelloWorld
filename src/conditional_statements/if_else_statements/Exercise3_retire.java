package conditional_statements.if_else_statements;

import java.util.Scanner;

public class Exercise3_retire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = input.nextInt();
        int left = 55 - age;
        if(age <= 55){
            System.out.println("There is " + left + " years left to retire.");
        }
        else {
            System.out.println("It is your time to get retired!");
        }
        System.out.println("End of the program");
    }
}
