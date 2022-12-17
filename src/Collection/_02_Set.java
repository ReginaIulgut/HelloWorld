package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Set {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("-----HashSet-----");
        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(0);
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(3);

        System.out.println(hashSet); //[0, null, 5, 10]

        System.out.println("-----LinkedHashSet-----");
        linkedHashSet.add(5);
        linkedHashSet.add(5);
        linkedHashSet.add(10);
        linkedHashSet.add(0);
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);//[5, 10, 0, null]

        System.out.println("-----TreeSet-----");
        treeSet.add(5);
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(0);
      //  treeSet.add(null); // NullPointerException
      //  treeSet.add(null);

        System.out.println(treeSet);
     }
}
