package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("TASK-1\n");
        System.out.println("Please enter 3 numbers ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        System.out.println("The product of the entered numbers is = " + number1 * number2 * number3);

        System.out.println("\nTASK-2\n");
        System.out.println("What is your name?");
        input.nextLine();
        String firstName = input.nextLine();
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.println("What is your year of birth?");
        int yearOfBirth = input.nextInt();
        int currentYear = 2022;
        System.out.println(firstName + " " + lastName + "'s age is " + (currentYear - yearOfBirth) + ".");

        System.out.println("\nTASK-3\n");
        System.out.println("What is your full name?");
        input.nextLine();
        String fullName = input.nextLine();
        System.out.println("What is your weight?");
        double kgWeight = input.nextDouble();
        System.out.println(fullName + "'s weight is = " + kgWeight * 2.205 + " lbs.");

        System.out.println("\nTASK-4\n");
        System.out.println("What is your full name?");
        input.nextLine();
        String student1FullName = input.nextLine();
        System.out.println("What is your age?");
        int student1Age = input.nextInt();

        System.out.println("What is your full name?");
        input.nextLine();
        String student2FullName = input.nextLine();
        System.out.println("What is your age?");
        int student2Age = input.nextInt();

        System.out.println("What is your full name?");
        input.nextLine();
        String student3FullName = input.nextLine();
        System.out.println("What is your age?");
        int student3Age = input.nextInt();

        System.out.println(student1FullName + "'s age is " + student1Age + ".");
        System.out.println(student2FullName + "'s age is " + student2Age + ".");
        System.out.println(student3FullName + "'s age is " + student3Age + ".");

        System.out.println("The average age is " + (student1Age + student2Age + student3Age) / 3 + ".");
        System.out.println("The eldest age is " + Math.max(Math.max(student1Age, student2Age) , student3Age) + ".");
        System.out.println("The youngest age is " + Math.min(Math.min(student1Age, student2Age) , student3Age) + ".");

    }
}
