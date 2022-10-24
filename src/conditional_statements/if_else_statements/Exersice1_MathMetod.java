package conditional_statements.if_else_statements;

import java.util.Scanner;

public class Exersice1_MathMetod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter math grade");
        int examResult = input.nextInt();
        if(examResult >= 60){
            System.out.println("You passed the exam");
        }
        else{
            System.out.println("You Failed");
        }
        System.out.println("End of the progrsm");

    }
}
