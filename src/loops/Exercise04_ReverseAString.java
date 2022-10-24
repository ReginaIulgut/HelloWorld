package loops;

import java.util.Scanner;

public class Exercise04_ReverseAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        int start = name.length()-1;
        while (start >= 0){
            System.out.print(name.charAt(start));
            start--;
        }
    }
}
