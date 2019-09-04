package z_18_12_0809.Dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DictionaryTest {
    public static void main(String[] args) {
        Dictionary slownik = new Dictionary();
        List<String> tlum = new ArrayList<>();
        tlum.add("I");
        tlum.add("Aye");
        tlum.add("Me");
        slownik.addWord("LambdaMethodReferenceExample", tlum);
        slownik.addWord("ty", Arrays.asList("you", "ya"));
        slownik.addWord("on", Collections.singletonList("he"));
        slownik.addWord("ona", Arrays.asList("she"));
        slownik.addWord("oni", Arrays.asList("they"));

        System.out.println(slownik.getTranslation("LambdaMethodReferenceExample"));

        System.out.println(slownik.getAll()); //wyswietli same klucze

        System.out.println(slownik.searchWord("on"));
    }


}
