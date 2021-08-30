package core.collections.set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> countrySet = new HashSet<>();

//        storage items by hash, not order
        countrySet.add("Canada");
        countrySet.add("Australia");
        countrySet.add("Czech Republic");
        countrySet.add("France");
        countrySet.add("Norway");
        countrySet.add("England");
        countrySet.add("Mexico");
        countrySet.add("Italy");
        countrySet.add("Brazil");
        countrySet.add("Scotland");

        System.out.println(countrySet.size());  // 10
        System.out.println(countrySet);
//        [Canada, Czech Republic, Norway, England, Brazil, Mexico, Italy, Scotland, Australia, France]

        System.out.println(countrySet.contains("China"));  // false

        countrySet.clear();

        System.out.println(countrySet.isEmpty());  // true
    }
}
