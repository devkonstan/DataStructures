package z_18_12_0809;

import java.util.ArrayList;

public class Przedszkole {
    public static void main(String[] args) {

        ArrayList<String> przedszkolaki = new ArrayList<>(); //w nawiasie mozna wstawic wielkosc(ilosc el)
        przedszkolaki.add("Michal");
        przedszkolaki.add("Rafal");
        przedszkolaki.add("Jacek");
        przedszkolaki.add("Piotrek");
        przedszkolaki.add("Zuzia");
        przedszkolaki.add("Joanna"); //5
        przedszkolaki.add("Marta");
        przedszkolaki.add("Brajan");

        System.out.println(przedszkolaki.size());
        System.out.println(przedszkolaki.get(5));

        przedszkolaki.add(0, "Brajanusz");
        //System.out.println(przedszkolaki.get(10));

        System.out.println(przedszkolaki.contains("Marta"));
        System.out.println(przedszkolaki.indexOf("Brajanusz"));
        System.out.println(przedszkolaki.indexOf("Michal"));

        //przedszkolaki.clear(); //czysci cala liste
        System.out.println("wielkosc: " + przedszkolaki.size());

        ArrayList<String> nowePrzedszkolaki = new ArrayList<>(3);
        nowePrzedszkolaki.add("Sędzimir");
        nowePrzedszkolaki.add("Feliks");
        nowePrzedszkolaki.add("Dorian");

        przedszkolaki.addAll(nowePrzedszkolaki);

        for (String s : przedszkolaki) {
            System.out.println(s);
        }
    }
}