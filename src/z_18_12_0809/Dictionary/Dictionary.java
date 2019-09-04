package z_18_12_0809.Dictionary;

import java.util.*;

//reprezentuje slownik
public class Dictionary {
    //konkretna implementacja interfejsu Map jest HashMap
    private Map<String, List<String>> slownik = new HashMap<>();

    //dzieki Map mamy wyzszy poziom abstrakcji niz uzywajac samego HashMap
    //arraylist, linkedlist, hashmap sa implementacjami klas takich jak lista, mapa itd.
    //mapy, listy itp. to interfejsy
    //pl to klucz a en wartosc bedaca lista wielu wariantow tlumaczenia
    public void addWord(String pl, List<String> en) {

        slownik.put(pl, en);
    }

    //pobiera klucz z wyrazem polskim i zwraca jego wartosc po angielsku
    public List<String> getTranslation(String pl) {
        return slownik.get(pl);
    }

    //setter
    public void editWord(String pl, List<String> en) {
        if (!slownik.containsKey(pl)) {
            slownik.put(pl, en);
        }
    }

    //nieuporzadkowana kolekcja
    public Set<String> getAll() {
        return slownik.keySet();
    }

    //metoda szukajaca po fragmencie klucza
    public List<String> searchWord(String phrase) {
        List<String> results = new ArrayList<>(); //tworzymy liste
        for (String key : slownik.keySet()) { //petla przejdzie przez wszystkie wyrazy slownika
            if (key.contains(phrase)) {
                results.add(key);
            }
        }

        Collections.sort(results);
        return results;

    }

}