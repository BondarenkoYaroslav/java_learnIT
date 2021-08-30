package core.collections.map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

//        storage items by order
        linkedHashMap.put(5, "Five");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(4, "Four");

        System.out.println(linkedHashMap);
//        overwriting a value by key
        linkedHashMap.put(3, "testThree");
//        return NULL if key does not exist
        System.out.println(linkedHashMap.get(6));

//        <K, V> like one element
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: \"" + entry.getKey() +
                    "\". Value of key: \"" + entry.getValue() + "\"");
        }
    }
}
