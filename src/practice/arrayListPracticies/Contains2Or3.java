package practice.arrayListPracticies;

import utilities.RandomNumberGenerator;

import java.util.ArrayList;

public class Contains2Or3 {
    public static void main(String[] args) {
        System.out.println(contains2Or3());
        System.out.println(contain7Or13());

    }
    public static boolean contains2Or3 () {
        ArrayList<Integer> randoms = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            randoms.add(RandomNumberGenerator.getARandomNumber(1,10));
        }
        System.out.println(randoms);
        return randoms.contains(2) || randoms.contains(3);
    }

    public static boolean contain7Or13 (){
        ArrayList<Integer> randoms = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            randoms.add(RandomNumberGenerator.getARandomNumber(-20, 20));
        }
        System.out.println(randoms);
        return randoms.contains(7) || randoms.contains(13);
    }
}
