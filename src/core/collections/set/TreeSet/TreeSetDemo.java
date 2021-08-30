package core.collections.set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> countrySet = new TreeSet<>();

//        storage items by auto sort (natural order)
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
//        [Australia, Brazil, Canada, Czech Republic, England, France, Italy, Mexico, Norway, Scotland]

        System.out.println(countrySet.contains("China"));  // false

        countrySet.clear();

        System.out.println(countrySet.isEmpty());  // true
    }
}
