package core.collections.list.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(0); // add 1 element
        integerList.clear(); // clear list

        if (integerList.isEmpty()){  // boolean isEmpty
            for (int i = 0; i < 100; i++) {
                integerList.add(0 + (int) (Math.random() * 100)); // add 100 element (random value int 0 - 99)
            }
        }
        System.out.println(integerList.size());  // 100

        integerList.add(5, 100);  // add new element on 5 index

        integerList.remove(5);  // remove element index 5

        Collections.sort(integerList);  // natural order

        System.out.println(integerList);  // toString

        for (Integer element : integerList) {  // for-each loop
            System.out.println(element);
        }
    }
}
