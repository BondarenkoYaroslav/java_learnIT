package core.collections.Comparable;

import java.util.*;

public class ComparableDemo {
    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();
        Set<People> peopleSet = new TreeSet<>();

        addItemsToCollection(peopleList);
        addItemsToCollection(peopleSet);

        for (People person : peopleSet) {
            System.out.println(person);
        }

        Collections.sort(peopleList);
        for (People person : peopleList) {
            System.out.println(person);
        }
    }

    private static void addItemsToCollection(Collection<People> collection) {
        collection.add(new People(5, "Marduk", "Anu"));
        collection.add(new People(3, "Zababa", "Inanna"));
        collection.add(new People(4, "Nergal", "Tammuz"));
        collection.add(new People(1, "Shamash", "Ereskigal"));
        collection.add(new People(2, "Enlil", "Naboo"));
    }
}
