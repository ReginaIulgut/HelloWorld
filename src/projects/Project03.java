package projects;

public class Project03 {
    public static void main(String[] args){

        System.out.println("\nTASK-1\n");
        String s1 ="24", s2 = "5";
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        System.out.println("The sum of 24 and 5 = " + (i1 + i2));
        System.out.println("The subtraction of 24 and 5 = " + (i1 - i2));
        System.out.println("The division of 24 and 5 = " + i1 / i2);
        System.out.println("The multiplication of 24 and 5 = " + i1 * i2);
        System.out.println("The remainder of 24 and 5 = " + i1 % i2);



        System.out.println("\nTASK-2\n");
        int randomNumber = (int)(Math.random() * 35)+1;
        System.out.println("Random number = " + randomNumber);
        if (randomNumber == 2 || randomNumber == 3 || randomNumber == 5 || randomNumber == 7 || randomNumber == 11 ||
        randomNumber == 13 || randomNumber == 17 || randomNumber == 19 || randomNumber == 23 || randomNumber == 29 ||
        randomNumber == 31){
            System.out.println(randomNumber + " is a prime number");
        }
        else {
            System.out.println(randomNumber + " is not a prime number");
        }

        System.out.println("\nTASK-3\n");
        int randomNumber1 = (int)(Math.random() * 50) + 1;
        int randomNumber2 = (int)(Math.random() * 50) + 1;
        int randomNumber3 = (int)(Math.random() * 50) + 1;
        System.out.println("Random number 1 = " + randomNumber1);
        System.out.println("Random number 2 = " + randomNumber2);
        System.out.println("Random number 3 = " + randomNumber3);
        int maxRandom = Math.max((Math.max(randomNumber1, randomNumber2)), randomNumber3);
        int minRandom = Math.min((Math.min(randomNumber1, randomNumber2)), randomNumber3);
        int midRandom;


       if(randomNumber1 < maxRandom && randomNumber1 > minRandom){
            midRandom = randomNumber1;
        }
        else if (randomNumber2 < maxRandom && randomNumber2 > minRandom){
            midRandom = randomNumber2;
        }
        else {
            midRandom = randomNumber3;
        }
        System.out.println("Lowest number is = " + minRandom +
                "\nMiddle number is = " + midRandom +
                "\nGreatest number is = " + maxRandom);

        System.out.println("\nTASK-4\n");
        char c = 'B';
        if (c >= 65 && c <= 90){
            System.out.println("The letter is uppercase");
        }
        else if (c >= 97 && c <= 122){
            System.out.println("The letter is lowercase");
        }
        else {
            System.out.println("Invalid character detected!!!");
        }

        System.out.println("\nTASK-5\n"); // a e i o u A E I O U
        char vowelChar = 'a';
        if (vowelChar == 65 || vowelChar == 69 || vowelChar == 73 || vowelChar == 79 || vowelChar == 85 ||
        vowelChar == 97 || vowelChar == 101 || vowelChar == 105 || vowelChar == 111 || vowelChar == 117){
            System.out.println("The letter is vowel");
        }
        else if ((vowelChar >= 66 && vowelChar <= 90) || (vowelChar >= 97 && vowelChar >= 122)){
            System.out.println("The letter is consonant");
        }
        else{
            System.out.println("Invalid character detected!!!");
        }

        System.out.println("\nTASK-6\n");
        char specialCharacter = '*';
        if ((specialCharacter >= 48 && specialCharacter <= 59) || (specialCharacter >= 65 && specialCharacter <= 90)
        || (specialCharacter >= 97 && specialCharacter <= 122)){
            System.out.println("Invalid character detected");
        }
        else {
            System.out.println("Special character is = " + specialCharacter);
        }

        System.out.println("\nTASK-7\n");
        char c01 = 'q';
        if ((c01 >= 65 && c01 <= 90) || (c01 >= 97 && c01 <= 122)){
            System.out.println("Character is letter");
        }
        else if (c01 >= 48 && c01 <= 57){
            System.out.println("Character is digit");
        }
        else{
            System.out.println("Character is a special character");
        }

    }
}
