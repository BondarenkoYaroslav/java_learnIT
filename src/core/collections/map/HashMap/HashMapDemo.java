package core.collections.map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

//        storage items by hash, not order
        hashMap.put(5, "Five");
        hashMap.put(1, "One");
        hashMap.put(3, "Three");
        hashMap.put(2, "Two");
        hashMap.put(4, "Four");

        System.out.println(hashMap);
//        overwriting a value by key
        hashMap.put(3, "overwritten Three");
//        return NULL if key does not exist
        System.out.println(hashMap.get(6));

//        <K, V> like one element
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: \"" + entry.getKey() +
                    "\". Value of key: \"" + entry.getValue() + "\"");
        }
    }
}
