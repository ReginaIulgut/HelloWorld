package practice.arrayListPracticies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 2) numbers.set(i,7);
        }
        System.out.println(numbers);

        Iterator<Integer> numbersIterator = numbers.iterator();
        while(numbersIterator.hasNext()){
            Integer number = numbersIterator.next();
            if (number % 2 == 0) numbersIterator.remove();
        }
     }
}
