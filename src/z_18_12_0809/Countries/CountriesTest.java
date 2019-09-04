package z_18_12_0809.Countries;

public class CountriesTest {
    public static void main(String[] args) {
        Countries kraje = new Countries();
        kraje.addCountry(new Country("Polska", "Warszawa", 38_000));
        kraje.addCountry(new Country("Niemcy", "Berlin", 82_000));
        kraje.addCountry(new Country("Rosja", "Moskwa", 120_000));

        for (Country kraj : kraje.getAllCountries()) {
            System.out.println(kraj);
        }

        kraje.removeCountry("Niemcy");
        System.out.println(kraje.getAllCountries());

        System.out.println("**********");

        kraje.updateCountry("Polska", new Country("IV RP", "Warszawa", 38_000));

        System.out.println(kraje.getAllCountries());

        System.out.println("**********");

        System.out.println(kraje.getCountry("Rosja"));

        System.out.println(kraje.getCapital("Warszawa"));

    }
}
