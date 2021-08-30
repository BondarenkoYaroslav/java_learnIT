package core.collections.iterator.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();

        listInt.add(0);
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);

        Iterator<Integer> iterator = listInt.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
