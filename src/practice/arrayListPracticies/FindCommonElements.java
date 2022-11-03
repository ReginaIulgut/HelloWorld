package practice.arrayListPracticies;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElements {
    public static void main(String[] args) {
        findCommonElements();


    }
    public static void findCommonElements(){
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(10, 20, 30, 50, 70));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(20, 50, 70, 100, 300));
        ArrayList<Integer> common = new ArrayList<>();

        for (int i = 0; i < num1.size(); i++) {

            for (int j = 0 ; j < num2.size(); j++){
                if(num1.get(i).equals(num2.get(j)) && !common.contains(num1.get(i))) {
                    common.add(num2.get(j));
                }
            }
        }
        if (common.isEmpty()) System.out.println("There is no matching elements");
            else common.forEach(System.out::println);
    }
}
