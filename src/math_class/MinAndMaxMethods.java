package math_class;

public class MinAndMaxMethods {
    public static void main(String[] args) {
        // Math class doesn't need object
        int maxNumber = Math.max(80, 27); // 80
        int maxNumber2 = Math.max(maxNumber, 123);
        int maxNumber3 = Math.max(maxNumber2, 625);

        System.out.println(maxNumber);
        System.out.println(maxNumber2);
        System.out.println(maxNumber3);

        int minNumber = Math.min(80, 27);
        int minNumber2 = Math.min(Math.max(1, 5), 4);
        int minNumber3 = Math.min(20-19, 12-21);

        System.out.println(minNumber);
        System.out.println(minNumber2);
        System.out.println(minNumber3);

        int maxNum = Math.max(6,9);
        int maxNum2 = Math.max(17,99);
        double maxNum3 = Math.max(34.2, 12.5);
        int maxNum4 = Math.max(-14,-32);
        int maxNum5 = Math.max(Math.max(17,49), 125);

        System.out.println("Max is" + maxNum);
        System.out.println("Max is" + maxNum2);
        System.out.println("Max is" + maxNum3);
        System.out.println("Max is" + maxNum4);
        System.out.println("Max is" + maxNum5);

        System.out.println("Min is " + Math.min(88, -89));

        System.out.println("Min is " + Math.min(6,9));
        System.out.println("Min is " + Math.min(17,49));
        System.out.println("Min is " + Math.min(34.2, 12.5));
        System.out.println("Min is " + Math.min(-14, -32));
        System.out.println("Min is " + Math.min(Math.min(17,49),125));
        System.out.println("Min is " + Math.min(Math.min(45,32), Math.min(56,89)));


    }
}
