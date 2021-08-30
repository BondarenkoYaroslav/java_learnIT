package core.collections.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<String> listNames = new ArrayList<>();

        listNames.add("Marduk");
        listNames.add("Anu");
        listNames.add("Zababa");
        listNames.add("Inanna");
        listNames.add("Nergal");
        listNames.add("Tammuz");
        listNames.add("Shamash");
        listNames.add("Ereskigal");
        listNames.add("Enlil");
        listNames.add("Naboo");

//        own implementation
        Collections.sort(listNames,
                new StringLengthComparatorRealization()); //ascending length sort

        System.out.println(listNames);

//        lambda function
        Collections.sort(listNames, (o1, o2) -> {
            return (o2.length() - o1.length());  //descending length sort
        });

        System.out.println(listNames);

//        anonymous class
        Collections.sort(listNames,
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o2.compareTo(o1);  //reverse natural order sort
                    }
                });

        System.out.println(listNames);
    }
}
