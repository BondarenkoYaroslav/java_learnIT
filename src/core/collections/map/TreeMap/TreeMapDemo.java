package core.collections.map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> treeMap = new TreeMap<>();

//        storage items by auto sort (natural order)
        treeMap.put(5, "Five");
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");

        System.out.println(treeMap);
//        overwriting a value by key
        treeMap.put(3, "testThree");
//        return NULL if key does not exist
        System.out.println(treeMap.get(6));

//        <K, V> like one element
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: \"" + entry.getKey() +
                    "\". Value of key: \"" + entry.getValue() + "\"");
        }
    }
}
