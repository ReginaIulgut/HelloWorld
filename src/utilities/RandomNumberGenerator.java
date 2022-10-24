package utilities;

public class RandomNumberGenerator {
    public RandomNumberGenerator(int i, int i1) {
    }
    /*
    Create a method thar generates a random number between 2 numbers(both included)
     */

    public static int getARandomNumber(int i1, int i2){
        return (int)(Math.random()*(Math.abs(i1 - i2) + 1)) + Math.min(i1, i2);
    }
}
