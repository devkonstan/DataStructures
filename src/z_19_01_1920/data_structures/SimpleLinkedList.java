package z_19_01_1920.data_structures;

/**
 * Zaimplementuj liste wiazana jednokierunkowa, przechowujaca dane typu int
 * Lista powininna posiadac nastepujace metody:
 * - prepend - dodaje element na poczatek listy
 * - append - dodaje element na koniec listy
 * - insert - dodaje element na zadanym indeksie
 * - remove - usuwa element na podanym indeksie
 * - getSize - zwraca ilosc elementow w liscie
 * - isEmpty - sprawdza czy lista jest pusta
 * - get - zwraca wartosc elementu na zadanym zakresie
 */

public class SimpleLinkedList {
    private int size;
    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void prepend(int element) { //dodaje na poczatek listy
        Node newNode = new Node(element); //czesc wspolna -> tworzymy nowy wezel

        if (isEmpty()) {
            head = newNode; //ten sam node oznaczony przez 2 referencje
            tail = newNode;
        } else {
            newNode.nextNode = head; //przypisujae head'a do nastepnika (przesuwa stary head na nowy wezel)
            head = newNode; //tworzy nowy wezel w headzie
        }
        size++;
    }

    public void append(int element) { //dodaje na koniec listy
        Node newNode = new Node(element); //czesc wspolna -> tworzymy nowy wezel

        if (isEmpty()) {
            tail = newNode; //ten sam node oznaczony przez 2 referencje
            head = newNode;
        } else {
            newNode.nextNode = tail; //przypisuje tail'a do nastepnika
            tail = newNode;
        }
        size++;
    }

    public void insert(int element, int index) {
        if (isEmpty()) {
            return;
        }

        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if (index == 0) {
            prepend(element);
        } else if (index == size) {
            append(element);
        } else {

            Node pre = head;
            for (int i = 0; i < index - 1; i++) {
                pre = pre.nextNode;
            }

            Node newNode = new Node(element); //wsadzamy nowy element

            Node aft = tail;
            for (int i = 0; i < index + 1; i++) {
                aft = aft.nextNode;
            }

        }

    }

    public void remove(int index) {
        if (isEmpty()) {
            return;
        }

        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        Node pre = head; //przypisujemy head do poprzednika
        for (int i = 0; i < index - 1; i++) {
            pre = pre.nextNode;
        }

        Node del = pre.nextNode; //kasujemy dowiazanie w poprzedniku dla Node z podanym indexem
        del = null;
        size--;

        Node aft = del.nextNode;
    }

    //znajdz w przykladach podobnego gettera zwracajacego wartosc z tablicy na podstawie indeksu
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        Node currentNode = head; //ustawiam tymczasowy wezel
        int currentIndex = 0; // head jest 0. indexem na poczatku

//        for (int i = 0; i < index; i++) {
//            currentNode=currentNode.nextNode;
//        }

        while (currentIndex < index) {
            currentNode = currentNode.nextNode;
            currentIndex++;
        }
        return currentNode.value;
    }

    private class Node<T> {
        //element + nastepny wezel
        int value;
        Node nextNode; //nastepny wezel bedacy obiektem tego samego typu

        Node(int value) {
            this.value = value;
        }
    }
}
