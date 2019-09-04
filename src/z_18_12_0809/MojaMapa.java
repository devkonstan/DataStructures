package z_18_12_0809;

import java.util.HashMap;

public class MojaMapa {

    public static void main(String[] args) {
                //klucz, wartosc
        HashMap<Integer, String> mapka = new HashMap<>();

        mapka.put(3781273, "Ewa");
        mapka.put(2312123, "Jacek");
        mapka.put(0, "Malgosia");
        mapka.put(385904239, "Brajanusz");
        mapka.put(8989087, "Jessica");

        //wyciagnac wartosc z 8989087
        System.out.println(mapka.get(8989087));
        //dodac cos z kluczem = 1
        mapka.put(1, "Konrad");
        System.out.println(mapka.size());
        mapka.replace(3781273, "Ewa", "Jessica");
        mapka.replace(8989087, "Jessica", "Ewa");
//        mapka.put(3781273,"Jessica");
//        mapka.put(8989087,"Ewa");
        System.out.println(mapka.get(8989087));
        System.out.println(mapka.get(3781273));
    }
}