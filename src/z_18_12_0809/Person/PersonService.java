package z_18_12_0809.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {
            //klasa abstrakcyjna           //implementacja klasy Map -> interfejs
    private Map<Integer, Person> persons = new HashMap<>();
    private Integer id = 0;

    public void savePerson(Person newPerson) {
        boolean shouldBeSave = true;

        //jesli dana osoba wystepuje w bazie danych
        for (Person person : persons.values()) {//szukamy czy ktos taki istnieje
            if (person.getLogin().equals(newPerson.getLogin())) {
                shouldBeSave = false;
            }
        }
        //jesli nie wystepuje, to zostaje do niej dodana
        if (shouldBeSave == true && newPerson.getPassword().length() >= 8) { //haslo musi byc >=8 znakow
            persons.put(++id, newPerson);
        }
    }


    //szuka po loginie a potem sprawdza haslo
    public boolean checkPerson(String login, String password) {
        for (Person person : persons.values()) {
            if (person.getLogin().equals(login) && person.getPassword().equals(password)) {
                return true;
            }
        }
        return false; //jesli przejdzie przez wszystkich
    }

    //wypluwa liste szukanych osob
    public List<Person> searchName(String phrase) {
        //to jest typ
        List<Person> results = new ArrayList<>();

        for (Person person : persons.values()) {
                //oba wpisy typu String konwertujemy do malych liter -> sprawdzamy to dla imienia i nazwiska
            if (person.getName().toLowerCase().contains(phrase.toLowerCase()) || person.getLastName().toLowerCase().contains(phrase.toLowerCase())) {
                results.add(person);
            }
        }
        return results;
    }
}
