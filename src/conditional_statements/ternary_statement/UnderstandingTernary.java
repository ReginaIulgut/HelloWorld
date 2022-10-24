package conditional_statements.ternary_statement;

public class UnderstandingTernary {
    public static void main(String[] args) {
        /*
        F -> female -> Jane
        M -> male   -> John
         */
        char gender = 'f';

        String name = gender == 'F' || gender == 'f' ? "Jane" : "John";
        System.out.println(name);
    }
}
