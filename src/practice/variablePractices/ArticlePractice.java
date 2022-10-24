package practice.variablePractices;

public class ArticlePractice {
    public static void main(String[] args) {

        String myName = "Regina";
        String myLastName = "Iulgutlina";
        String myFullName = myName + " " + myLastName;
        int birthYear = 1995;
        double monthlyIncome = 50.687;
        char dollarSigh = '$';
        boolean isRich = false;

        System.out.println("My full name " + myFullName+ ". I was born in " + birthYear + ". " +
                "\nMy monthly income is " + dollarSigh +
                monthlyIncome + ". Am I rich? = \"" + isRich + "\"");
    }
}
