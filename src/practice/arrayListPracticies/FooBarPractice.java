package practice.arrayListPracticies;

import java.util.ArrayList;
import java.util.Arrays;

public class FooBarPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        printLucky();
        printFooBar();

    }

    public static void printLucky (){
        for (int i = 1; i <= 10; i++ ){
            if (i % 3 == 0) System.out.println("Lucky");
            else System.out.println(i);
        }
    }

    public static void printFooBar (){
        for(int i = 1; i <= 10; i++){
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i %  5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
    }
}
