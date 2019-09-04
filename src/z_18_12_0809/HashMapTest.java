package z_18_12_0809;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] arr) {

        /* Create object of HashMap */

        HashMap<String, String> hashmapka = new HashMap<String, String>();

        /* Add entries to hashMap (Keys,Values) */
        hashmapka.put("A", "Apple");
        hashmapka.put("B", "Book");
        hashmapka.put("C", "Car");
        hashmapka.put("D", "Dog");
        hashmapka.put("E", "Elephant");
        hashmapka.put("F", "Flower");
        hashmapka.put("F", "Flower");

        // Print the content of the hashMap
        Set<HashMap.Entry<String, String >> secik = hashmapka.entrySet();

        for (HashMap.Entry wpis : secik) {

            System.out.println("Key=" + wpis.getKey() + ", Value=" + wpis.getValue());
        }

        System.out.println("-----------------------------");

        Set<Map.Entry<String, String>> hashSet = hashmapka.entrySet();
        for (Map.Entry entry : hashSet) {

            System.out.println("Key=" + entry.getKey() + ", Value=" + entry.getValue());
        }

        System.out.println("-----------------------------");

        // Print the size of hashMap
        System.out.println("HashMap size=" + hashmapka.size());

        // Checking and searching
        if (hashmapka.containsKey("X")) {
            System.out.println("HashMap has a key X");
        } else {
            System.out.println("HashMap hasn't a key X");
        }

        // Remove the content of the hashMap
        hashmapka.clear();

        // Check if the hashMap empty
        if (hashmapka.isEmpty()) {
            System.out.println("The hashMap is empty");
        }

    }
}

