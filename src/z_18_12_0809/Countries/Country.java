package z_18_12_0809.Countries;

public class Country implements Comparable<Country> {
    private String name;
    private String capital;
    private int population;

    Country(String name, String capital, int population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                '}';
    }

    //implementujemy interfejs Comparable zwracajacy int
    //wynik 0 oznacza, ze wartosci sa rowne i kolejnosc bedzie losowa
    //wynik 1 =/= 0 czyli cos jest wieksze od innego
    //wynik -1 to odwrotna kolejnosc
    //java wie jak sortowac podstawowe typy a nie wie jak robic to z naszymi wlasnymi obiektami
    @Override //uzyskane poprzez Alt+Insert
    public int compareTo(Country country) {
        //return country.getName().compareTo(this.name); //ten sposob sortuje odwrotnie
        return this.name.compareTo(country.getName());
    }
}
//hashset mozna zamienic na treeset ktory automatycznie sortuje obiekty
//Collections.sort(countries) zadziala jesli to bedzie mapa
