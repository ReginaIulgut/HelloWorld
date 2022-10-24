package arrays;

public class _04_CountElements_InIntArrays {
    public static void main(String[] args) {
        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};
        /*
        negative: 2
        positive: 5
        neutral or zeros: 3

        even: 6
        odd: 4

        sum of the numbers: 28
         */
        int negatives = 0;
         for (int number : numbers){
             if (number < 0) negatives++;
         }
        System.out.println("Negative count is = " + negatives);


         int positives = 0;
         for (int number : numbers){
             if (number > 0) positives++;
         }
        System.out.println("Positive count is = " + positives);


        int evenNums = 0;
        for (int number : numbers){
            if(number % 2 == 0) evenNums++;
        }
        System.out.println("Even count is = " + evenNums);


        int oddNums = 0;
        for(int number: numbers){
            if(number % 2 == 1) oddNums++;
        }
        System.out.println("Odd count is = " + oddNums);


    }
}
