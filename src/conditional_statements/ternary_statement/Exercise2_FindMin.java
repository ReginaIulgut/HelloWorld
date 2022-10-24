package conditional_statements.ternary_statement;

import java.util.Random;

public class Exercise2_FindMin {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10); // 0 to 9
        int randomNumber2 = random.nextInt(10) + 1; // 0 to 10
        System.out.println(randomNumber);
        System.out.println(randomNumber2);

        int min2 = randomNumber < randomNumber2 ? randomNumber : randomNumber2;
        System.out.println(min2);

        System.out.println("Random Class");

        int num1 = (int)(Math.random() * 10)+1;
        int num2 = (int)(Math.random() * 10)+1;
        System.out.println(num1);
        System.out.println(num2);

        int min = num1 < num2 ? num1 : num2;
        System.out.println(min);

    }
}
