package z_19_01_1920.data_structures;

import java.util.Arrays;

/**
 * Zaimplementuj liste wiazana jednokierunkowa, przechowujaca dane typu int
 * Lista powininna posiadac nastepujace metody:
 * - add - dodaje element na koniec listy
 * - getSize() - zwraca ilosc elementow w liscie
 * - get
 * - isEmpty - sprawdza czy lista jest pusta
 */
public class SimpleArrayList {
    private final static int DEFAULT_CAPACITY = 10;

    private int[] content;
    private int size;

    public SimpleArrayList() {

        content = new int[DEFAULT_CAPACITY];
    }

    public void add(int element) {
        if (size == content.length) {
            content = Arrays.copyOf(content, size * 2);
        }
        content[size++] = element;
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return content[index];
    }

    public int getSize() {

        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } return false;
    }


}
