package primitives;

public class Numbers {
    public static void main(String[] args) {
        /*
        There are 6 primitives used to store numbers as data
        byte, short, int, long -> used to store absolute numbers like 3 5
        float, double -> used for floating numbers like 10.5

        byte -> 1 byte
        short -> 2 bytes
        int -> 4 bytes
        long -> 8 bytes L

        NOTE: Most of the case we use int

        John
        his age -> 45
        his fav number -> 150
        his balance -> 400.45

         */

        // dataType variableMane = value;

        byte age = 45;
        long favNumber = 2_147_483_648L;
        long myNumber = 1;

        /*
        Flouting numbers
        float -> 4 bytes
        double -> 8 bytes

        note: most of the cases we use double
         */

        float balance1 = 23.4757583F;
        double balance2 = 23.4757583;

        System.out.println(balance1); //23.475758
        System.out.println(balance2); //23.4757583

        double price = 23.5;
        System.out.println(price); // 23.5


        System.out.println(age); // 45
        System.out.println(favNumber);

    }
}
