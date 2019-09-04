package z_18_12_0809;

import java.util.ArrayList;

public class ListaTablic {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Jaca");
        lista.add("Beny");


        for (String s : lista) {
            System.out.println(s);
        }

        lista.remove("Jaca");

        System.out.println(lista.contains("Jaca"));
        System.out.println(lista.indexOf("Beny"));
    }
}
