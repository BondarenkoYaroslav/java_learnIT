package core.collections.iterator.ListIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> countryList = new ArrayList<>();

        countryList.add("Canada");
        countryList.add("Australia");
        countryList.add("Czech Republic");
        countryList.add("France");
        countryList.add("Norway");
        countryList.add("England");
        countryList.add("Mexico");
        countryList.add("Italy");
        countryList.add("Brazil");
        countryList.add("Scotland");

        Collections.sort(countryList);

        ListIterator<String> listIterator = countryList.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        ListIterator<String> reversePositionListIterator = countryList.listIterator(countryList.size());

        while (reversePositionListIterator.hasPrevious()) {
            System.out.println(reversePositionListIterator.previous());
        }
    }
}
