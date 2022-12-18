package Collection;

import java.util.*;

public class practice06_CalculateCharacters {
    public static void main(String[] args) {
        String str = "banana";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : str.toCharArray()) {
            if(!map.containsKey(c)) map.put(c,1);
            else map.put(c, map.get(c) + 1);
        }
        System.out.println(map);

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) System.out.println(entry.getKey());
        }

        System.out.println("-----TASK-----");

        System.out.println(getMostCounted(null));
        System.out.println(getMostCounted(""));
        System.out.println(getMostCounted("a"));
        System.out.println(getMostCounted("apple"));
        System.out.println(getMostCounted("papa"));
        System.out.println(getMostCounted("abcabcabc"));
    }

    public static Set<Character> getMostCounted (String str){

        /*
        1.count all the unique characters
        2.find the max occurrence
        3.find all the characters that has the max count, put them in a collection and return it back
         */
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        Set<Character> result = new LinkedHashSet<>();
        if(str == null || str.isEmpty()) return result;

        for (Character c : str.toCharArray()){
            if(!map.containsKey(c)) map.put(c,1);
            else map.put(c, map.get(c) + 1);
        }
        int maxCount = new TreeSet<>(map.values()).last();

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxCount) result.add(entry.getKey());
        }
        return result;
    }
}
