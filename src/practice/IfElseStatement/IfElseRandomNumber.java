package practice.IfElseStatement;

public class IfElseRandomNumber {
    public static void main(String[] args){

        int myRandom = (int)(Math.random()*51);

        System.out.println(myRandom);
        // boolean included already

        System.out.println(myRandom >= 10 && myRandom <=25);

        System.out.println(myRandom);

        if (myRandom >= 10 && myRandom <=25){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        System.out.println(myRandom);
        System.out.println((myRandom >= 10 && myRandom <=25 ) ? "true " : "false");


    }

}
