package math_class;

public class MathRandomMethod {
    public static void main(String[] args) {

        // System.out.println("Random number is " + Math.random());

        double myRandom = Math.random();
        System.out.println("Random number is " + myRandom);

        double myRandom0_10 = Math.random() * 10;
        System.out.println("Random number from 0 to 10 is " + myRandom0_10);

       int myRandom23 = (int) (Math.random() * 24);  //so you can get 23 in random
        System.out.println(myRandom23);

        int myDice6 = (int) (Math.random()*6 ) + 1; // no 0, from 1 to 6
        System.out.println(myDice6);

        /*
        (int)(randomNumber * (big point - small point + 1) + small point where to start)
         */
        // 50 - 100
        int random = (int)(Math.random() * (100 - 50 + 1) + 50);
        System.out.println(random);

        int random20to40 = (int)(Math.random() * (40 - 20 + 1) + 20);
        System.out.println("Random number between 20 to 40 is " + random20to40);
    }
}
