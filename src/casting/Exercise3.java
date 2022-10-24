package casting;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        /*
        ps5 - 600$
        $20 per day
         */
        Scanner input = new Scanner(System.in);
        double price = 600;
        System.out.println("The price is " + price);
        System.out.println("How much you save");
        double dailySave = input.nextDouble();
        System.out.println("You can buy it in " + (int)(price / dailySave));
    }
}
