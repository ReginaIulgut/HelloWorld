package practice.IfElseStatement;

public class IfElsePractice {
    public static void main(String[] args) {

        int myInt = (int)(Math.random()* 75);
        System.out.println(myInt);

        if (myInt <= 24 && myInt >= 0)
            System.out.println("First quarter");
        else if (myInt >= 25 && myInt <= 49)
            System.out.println("Second Quarter");
        else if (myInt >= 50 && myInt <= 74)
            System.out.println("Third quarter");



    }


}
