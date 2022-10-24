package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("TASK-1\n");
        System.out.println("Please enter 2 numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println("The difference between numbers is = " + Math.abs(number1 - number2));

        System.out.println("\nTASK-2\n");
        System.out.println("Please enter 5 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        System.out.println("Max value = " + Math.max(Math.max(Math.max(num1, num2), Math.max(num3, num4)), num5));
        System.out.println("Min value = " + Math.min(Math.min(Math.min(num1, num2), Math.min(num3, num4)), num5));

        System.out.println("\nTASK-3\n");
        int randomNumber1 = (int) (Math.random() * (100 - 50 +1) + 50);
        int randomNumber2 = (int) (Math.random() * (100 - 50 +1) + 50);
        int randomNumber3 = (int) (Math.random() * (100 - 50 +1) + 50);

        System.out.println("Number 1 = " + randomNumber1);
        System.out.println("Number 2 = " + randomNumber2);
        System.out.println("Number 3 = " + randomNumber3);
        System.out.println("The sum of the numbers = " + (randomNumber1 + randomNumber2 + randomNumber3));

        System.out.println("\nTASK-4\n");
        double alexMoney = 125, mikeMoney = 220;
        alexMoney -= 25.5;
        mikeMoney += 25.5;
        System.out.println("Alex's money: $" + alexMoney +
                "\nMike's money: $" + mikeMoney);

        System.out.println("\nTASK-5\n");
        double needToSave = 390, saveADay = 15.60;
        double saveDays = needToSave / saveADay;
        int daysToSaveBicycle = (int)(saveDays);
        System.out.println(daysToSaveBicycle);

        System.out.println("\nTASK-6\n");
        String s1 = "5", s2 = "10";
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        System.out.println("-Sum of 5 and 10 is = " + (i1 + i2));
        System.out.println("-Product of 5 and 10 is = " + i1 * i2);
        System.out.println("-Division of 5 and 10 is = " + i1 / i2);
        System.out.println("-Subtraction of 5 and 10 is = " + (i1 - i2));
        System.out.println("-Remainder of 5 and 10 is = " + i1 % i2);

        System.out.println("\nTASK-7\n");
        String s01 = "200", s02 = "-50";
        int i01 = Integer.parseInt(s01);
        int i02 = Integer.parseInt(s02);
        System.out.println("The greatest value is = " + Math.max(i01, i02));
        System.out.println("The smallest value is = " + Math.min(i01, i02));
        System.out.println("the average is = " + (i01 + i02) / 2);
        System.out.println("The absolute number is = " + Math.abs(i01 - i02));

        System.out.println("\nTASK-8\n");
        double quarters = 3 * 0.25, dime = 0.10, nickels = 2 * 0.05, penny = 0.01;
        double savePerDay = quarters + dime + nickels + penny;
        double save24$ = 24 / savePerDay;
        double save168$ = 168 / savePerDay;
        int daysToSave24$ = (int)(save24$);
        int daysToSave168$ = (int) save168$;
        double save5months = 5 * 30 * savePerDay;
        System.out.println(daysToSave24$ + " days");
        System.out.println(daysToSave168$ + " days");
        System.out.println("$" + save5months);

        System.out.println("\nTASK-9\n");
        double newComputer = 1250, daily = 62.5;
        double daysToBuyComputer = newComputer / daily;
        int needDaysToBuy = (int)(daysToBuyComputer);
        System.out.println(needDaysToBuy);

        System.out.println("\nTASK-10\n");
        double newCar = 14265, option1 = 475.50, option2 = 951;
        double monthsOption1 = newCar / option1;
        double monthsOption2 = newCar / option2;
        int monthsToPay1 = (int)(monthsOption1);
        int monthsToPay2 = (int)(monthsOption2);
        System.out.println("Option 1 will take " + monthsToPay1 + " months");
        System.out.println("Option 2 will take " + monthsToPay2 + " months");

        System.out.println("\nTASK-11\n");

        System.out.println("Please enter 2 numbers");
        int numb1 = input.nextInt();
        int numb2 = input.nextInt();
        double numb1Double = numb1;
        double numb2Double = numb2;
        double numbersDivision = numb1Double / numb2Double;
        System.out.println(numbersDivision);

        System.out.println("\nTASK-12\n");

        int random1 = (int)(Math.random() * 101);
        int random2 = (int)(Math.random() * 101);
        int random3 = (int)(Math.random() * 101);

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        boolean ifGreater = true;
        boolean ifLessOrEqual = false;

        if (random1 <= 25)
        System.out.println(ifLessOrEqual);
        else
            System.out.println(ifGreater);
        if (random2 <= 25)
            System.out.println(ifLessOrEqual);
        else
            System.out.println(ifGreater);
        if (random3 <= 25)
            System.out.println(ifLessOrEqual);
        else
            System.out.println(ifGreater);

        System.out.println("\nTASK-13\n");

        System.out.println("Please enter number between 1 and 7");
        int numberDay = input.nextInt();
        if (numberDay == 1)
            System.out.println("Monday");
        else if (numberDay == 2)
            System.out.println("Tuesday");
        else if (numberDay == 3)
            System.out.println("Wednesday");
        else if (numberDay == 4)
            System.out.println("Thursday");
        else if (numberDay == 5)
            System.out.println("Friday");
        else if (numberDay == 6)
            System.out.println("Saturday");
        else
            System.out.println("Sunday");

        System.out.println("\nTASK-14\n");

        System.out.println("Tell me your exam results");
        int exam1 = input.nextInt();
        int exam2 = input.nextInt();
        int exam3 = input.nextInt();
        int totalAverage = (exam1 + exam2 + exam3) / 3;

        if (totalAverage >= 70)
            System.out.println("You passed!");
        else
            System.out.println("You failed!");

        System.out.println("\nTASK-15\n");

        System.out.println("Please enter 3 numbers");
        int matchNumber1 = input.nextInt();
        int matchNumber2 = input.nextInt();
        int matchNumber3 = input.nextInt();

        if (matchNumber1 == matchNumber2 && matchNumber2 == matchNumber3)
            System.out.println("TRIPLE MATCH");
        else if (matchNumber1 != matchNumber2 && matchNumber2 != matchNumber3 && matchNumber3 != matchNumber1)
            System.out.println("NO MATCH");
        else
            System.out.println("DOUBLE MATCH");
    }
}
