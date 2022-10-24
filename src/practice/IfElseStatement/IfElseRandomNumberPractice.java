package practice.IfElseStatement;

public class IfElseRandomNumberPractice {
    public static void main(String[] args){
        int myRandomNumber = (int)(Math.random()*100+1);
        if(myRandomNumber >= 0 && myRandomNumber <= 25){
            System.out.println(myRandomNumber + " in the first quarter");
        }
        else if (myRandomNumber >= 26 && myRandomNumber <= 50){
            System.out.println(myRandomNumber + " is in the second quarter");
        }
        else if (myRandomNumber >= 51 && myRandomNumber <= 75){
            System.out.println(myRandomNumber + " in the third quarter");
        }
        else if (myRandomNumber >= 76 && myRandomNumber <= 100){
            System.out.println(myRandomNumber + " in the fourth quarter");
        }
        if (myRandomNumber >= 0 && myRandomNumber <=50 ){
            System.out.println(myRandomNumber + " in the first half");
        }
        else{
            System.out.println(myRandomNumber + " in the second half");
        }


        boolean isRaining = true;
        boolean hasUmbrella = true;
        boolean hungry = true;

        /*
        it is raining outside
        you can go outside

        it is not raining outside

         */
    }
}
