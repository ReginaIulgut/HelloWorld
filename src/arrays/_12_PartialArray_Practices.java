package arrays;

public class _12_PartialArray_Practices {
    public static void main(String[] args) {

    }

    public static int sumOfThree (int[] numbers){
        int sum = 0;
        for (int i = 0; i < 3; i++){
            sum += numbers[i];
        }
        return sum;
    }

    public static int sumOfLastFive (int[] numbers){
        int sum = 0;
        for (int i = numbers.length - 1; i < numbers.length - 6; i--){
            sum += numbers[i];
        }
        return sum;
    }
}
