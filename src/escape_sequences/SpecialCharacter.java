package escape_sequences;

public class SpecialCharacter {
    public static void main(String[] args) {
        /*
        apple\banana
        I like "Sundays" and apple.
        My fav fruits are "Kiwi" and "oranges"
         */
        System.out.println("apple\\\\orange");
        System.out.println("I like \"Sundays\" and apple "); // add \ before "
        System.out.println("My fav fruits are\n\"Kiwi\" and\n\"Oranges\"");
    }
}
