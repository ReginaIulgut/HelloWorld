package Collection;

import java.util.HashSet;
import java.util.Set;

public class _04_Set_Methods {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Foo");
        set.add("Bar");
        set.add("bar");
        set.add("foo");
        set.add("abc");
        set.add("xxx");
        System.out.println(set);
        System.out.println(set.size()); // 6
        System.out.println(set.isEmpty());
        System.out.println(set.contains("ABC"));
        System.out.println(set.contains("abc"));
        System.out.println(set.remove("AAA"));
        System.out.println(set.remove("xxx"));
        System.out.println(set);
        set.removeIf(e -> e.toLowerCase().startsWith("b"));
        System.out.println(set);

        set.forEach(System.out::println);
    }
}
