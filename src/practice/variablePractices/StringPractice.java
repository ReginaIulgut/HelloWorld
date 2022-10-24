package practice.variablePractices;

public class StringPractice {
    public static void main(String[] args){

        String schoolName = "TechGlobal";
        String myName = "Regina";
        int myAge = 27;
        double myHeight = 5.4;
        boolean isEligibleToDrive = true;

        System.out.println("My school name is " + schoolName + ". My name is " + myName
                + ". I am " + myAge + " years old. \nMy height is " + myHeight + "." + " I am " +
                "eligible to drive \"" + isEligibleToDrive + "\".");

        String message = "\n\tJava is high-level\\hard, class-based, object-oriented programming language that is \n" +
                "designed to have as few implementation \"dependencies\" as possible. It is a general-purpose " +
                "\nprogramming language intended to let programmers write once, run anywhere (WORA)," +
                "\nmeaning that compiled Java code can run on all platforms that support Java without the need to recompile.";

        System.out.print(message);
    }
}
