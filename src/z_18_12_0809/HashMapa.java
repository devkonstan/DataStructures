package z_18_12_0809;

import java.lang.reflect.Array;
import java.util.*;

//klucz integer, value String
public class HashMapa {
    public static void main(String[] args) {
        HashMap<String, Integer[]> dziennik = new HashMap<>();

        Integer[] ocenyJasia = {1, 1, 1, 1, 1};
        dziennik.put("Jasiu", ocenyJasia);
        Integer[] ocenyJacka = {2, 1, 3, 1, 1, 1};
        dziennik.put("Jacek", ocenyJacka);
        Integer[] malgosia = {5};
        dziennik.put("Malgosia", malgosia);
        Integer[] eve = {4, 3, 5, 4, 4};
        dziennik.put("Ewa", eve);

        for (Integer[] oceny : dziennik.values()) {
            for (int i = 0; i < oceny.length; i++) {
                System.out.print(oceny[i] + " ");

            }
            System.out.println();
        }
        System.out.println("ilosc dzieci: " + dziennik.size());

        System.out.println("********");

        Set secik = dziennik.entrySet();
        Iterator iteratorek = secik.iterator();
        while (iteratorek.hasNext()) {
            Map.Entry wpis = (Map.Entry) iteratorek.next();
            System.out.println("key is: " + wpis.getKey() + " & value is: " + Arrays.toString((Object[]) wpis.getValue()));
        }

        System.out.println("**********");

        if (dziennik.containsKey("Ewa")) {
            Integer[] nowaEwa = {4, 3, 5, 4, 4};
            dziennik.put("Ewa_2", eve);
        } else {
            Integer[] nowaEwa = {4, 3, 5, 4, 4};
            dziennik.put("Ewa", eve);
        }

        System.out.println(dziennik.keySet().toString() + " ");
        for (Integer[] value : dziennik.values()) {
            System.out.println(" " + Arrays.toString(value));
        }

        System.out.println("**********");

        for (String name : dziennik.keySet()) {

            String key = name;
            System.out.println(key + " " + Arrays.toString(dziennik.get(key)));
        }

        System.out.println("**********");

        Integer[] ewe2 = {1, 1, 1, 3, 1};

        dziennik.put("Ewa", ewe2); //podmianka wartosci
//        dziennik.put("1", null);
//        dziennik.put("2", null);
//        dziennik.put(null, ewe2);

        for (Map.Entry<String, Integer[]> stringEntry : dziennik.entrySet()) {
            System.out.println(stringEntry.getKey()+" "+ Arrays.asList(stringEntry.getValue())); //co wpisac zeby przelecialo przez wszystkie?

        }

    }

}
