package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        System.out.println("\nTASK-1\n");
        Scanner input = new Scanner(System.in);
        int number1, number2;
        System.out.println("Please enter number 1:");
        number1 = input.nextInt();
        System.out.println("Please enter number 2:");
        number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum of two numbers you entered is = " + sum);

        System.out.println("\nTASK-2\n");
        int number01, number02;
        System.out.println("Please enter number 1:");
        number01 = input.nextInt();
        System.out.println("Please enter number 2:");
        number02 = input.nextInt();
        int product = number01 * number02;
        System.out.println("The product of given 2 numbers is: " + product);

        System.out.println("\nTASK-3\n");
        double floatingNumber1, floatingNumber2;
        System.out.println("Please enter floating number 1: ");
        floatingNumber1 = input.nextDouble();
        System.out.println("Please enter floating number 2: ");
        floatingNumber2 = input.nextDouble();
        System.out.println("The sum of given numbers is = " + (floatingNumber1 + floatingNumber2));
        System.out.println("The product of given numbers is = " + floatingNumber1 * floatingNumber2);
        System.out.println("The subtraction of given numbers is = " + (floatingNumber1 - floatingNumber2));
        System.out.println("The division of given numbers is = " + floatingNumber1 / floatingNumber2);
        System.out.println("The remainder of given numbers is = " + floatingNumber1 % floatingNumber2);

        System.out.println("\nTASK-4\n");
        System.out.println(-10 + 7 * 5);
        System.out.println((72 + 24) % 24);
        System.out.println(10 + -3 * 9 / 9);
        System.out.println(5 + 18 / 3 * 3 - (6 % 3));

        System.out.println("\nTASK-5\n");
        int averageNumber1, averageNumber2;
        System.out.println("Please enter number 1: ");
        averageNumber1 = input.nextInt();
        System.out.println("Please enter number 2: ");
        averageNumber2 = input.nextInt();
        int averageNumber = (averageNumber1 + averageNumber2) / 2;
        System.out.println("The average of given numbers is: " + averageNumber);

        System.out.println("\nTASK-6\n");
        int averageNumber01, averageNumber02, averageNumber03, averageNumber04, averageNumber05;
        System.out.println("Please enter 5 numbers: ");
        averageNumber01 = input.nextInt();
        averageNumber02 = input.nextInt();
        averageNumber03 = input.nextInt();
        averageNumber04 = input.nextInt();
        averageNumber05 = input.nextInt();
        int averageOfNumbers = (averageNumber01 + averageNumber02 + averageNumber03 + averageNumber04 + averageNumber05) / 5;
        System.out.println("The average of given numbers is: " + averageOfNumbers);

        System.out.println("\nTASK-7\n");
        int squareNumber1, squareNumber2, squareNumber3;
        System.out.println("Please enter 3 numbers: ");
        squareNumber1 = input.nextInt();
        squareNumber2 = input.nextInt();
        squareNumber3 = input.nextInt();
        int squareOfNumber1 = squareNumber1 * squareNumber1;
        int squareOfNumber2 = squareNumber2 * squareNumber2;
        int squareOfNumber3 = squareNumber3 * squareNumber3;
        System.out.println("The " + squareNumber1 + " multiplied with " + squareNumber1 + " is = " + squareOfNumber1);
        System.out.println("The " + squareNumber2 + " multiplied with " + squareNumber2 + " is = " + squareOfNumber2);
        System.out.println("The " + squareNumber3 + " multiplied with " + squareNumber3 + " is = " + squareOfNumber3);

        System.out.println("\nTASK-8\n");
        int sideOfSquare;
        System.out.println("Please enter the side of a square: ");
        sideOfSquare = input.nextInt();
        int areaOfSquare = sideOfSquare * sideOfSquare;
        int perimeterOfSquare = 4 * sideOfSquare;
        System.out.println("Perimeter of the square = " + perimeterOfSquare);
        System.out.println("Area of the square = " + areaOfSquare);

        System.out.println("\nTASK-9\n");
        double annualRate = 90_000;
        System.out.println("A Software Engineer in Test can earn $" + annualRate * 3 + " in 3 years.");

        System.out.println("\nTASK-10\n");
        String favColor, favBook;
        int favNumber;
        System.out.println("Dear User, what is your favorite book?");
        input.nextLine();
        favBook = input.nextLine();
        System.out.println("Dear User, what is your favorite color?");
        favColor = input.nextLine();
        System.out.println("Dear User, what is your favorite number?");
        favNumber = input.nextInt();
        System.out.println("\tUser's favorite book is: " + favBook +
                "\n\tUser's favorite color is: " + favColor +
                "\n\tUser's favorite number is: " + favNumber);

        System.out.println("\nTASK-11\n");
        String firstName, lastName, emailAddress, phoneNumber, address;
        int age;
        System.out.println("Dear User, what is your first name?");
        input.nextLine();
        firstName = input.nextLine();
        System.out.println("Dear User, what is your last name?");
        lastName = input.nextLine();
        System.out.println(firstName + " " + lastName + ", what is your age?");
        age = input.nextInt();
        System.out.println(firstName + " " + lastName + ", what is your email address?");
        input.nextLine();
        emailAddress = input.nextLine();
        System.out.println(firstName + " " + lastName + ", what is your phone number?");
        phoneNumber = input.nextLine();
        System.out.println(firstName + " " + lastName + ", what is your address?");
        address = input.nextLine();
        System.out.println("User who joined this program is " + firstName + " " + lastName + ". " + firstName + "'s age is "
                + age + ". " + firstName + "'s email \naddress is " + emailAddress + ", phone number is " + phoneNumber
                + ", and address is \n" + address + ".");

    }
}
