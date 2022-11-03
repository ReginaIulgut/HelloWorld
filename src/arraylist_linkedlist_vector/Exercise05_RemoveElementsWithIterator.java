package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveElementsWithIterator {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Pen", "Pencil", "Book", "NoteBook", "MacBook Pro"));
        Iterator<String> objectsIterator = objects.iterator();
        while(objectsIterator.hasNext()){
            String o = objectsIterator.next();
            if (o.contains("Book")) objectsIterator.remove();
        }
        System.out.println(objects);
    }
}
