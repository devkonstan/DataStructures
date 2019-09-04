package z_18_12_0809.Person;

public class PersonTest {
    public static void main(String[] args) {

        Person osoba1 = new Person("Jan", "Kowalski", "janek", "admin123");
        Person osoba2 = new Person("Janek", "Krecina", "zdzichu", "admin231");
        Person osoba3 = new Person("Andrzej", "Duda", "endrju", "admin321");

        PersonService serwis = new PersonService();
        serwis.savePerson(osoba1);
        serwis.savePerson(osoba2);
        serwis.savePerson(osoba3);

        System.out.println(serwis.searchName("Ja"));
        System.out.println(serwis.checkPerson("janek", "admin123"));
        System.out.println(serwis.checkPerson("janek2", "admin123"));

        Person osoba4 = new Person("Harry", "Redknapp", "harry", "12345678");
        serwis.savePerson(osoba4);
        System.out.println(serwis.searchName("harry"));
    }
}
