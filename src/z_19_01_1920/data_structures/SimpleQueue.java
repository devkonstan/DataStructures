package z_19_01_1920.data_structures;

/**
 * Zaimplementuj kolejke, przechowujaca dane typu int
 * Kolejka powininna posiadac nastepujace metody:
 * - enqueue - dodaje element do kolejki
 * - dequeue - usuwa element z kolejki
 * - peek - pozwala podejrzec element na poczatku kolejki
 * - isEmpty - sprawdza czy kolejka jest pusta
 */

public class SimpleQueue {
    //add/offer ->enqueue
    //poll ->dequeue

    private static final int NOT_FOUND = -1;
    private int size;
    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public int peek() {
//        if (head == null) {
//            return -1;
//        } else {
//            return head.value;
//        }
//                                true      false
        return head == null ? NOT_FOUND : head.value; //sprawdza tylko head, bo poczatek kolejki
    }

    public void enqueue(int element) {
        Node newNode = new Node(element); //czesc wspolna

        if (isEmpty()) {
            head = newNode; //ten sam node oznaczony przez 2 referencje
            tail = newNode; //ten sam node oznaczony przez 2 referencje
        } else {
            tail.nextNode = newNode; //przypisuje newNode do nastepnika
            tail = newNode; //stary tail otrzymuje dowiazanie do nowego
        }
        size++;
    }

    public int dequeue() { //pobiera i usuwa element
        if (isEmpty()) {
            return NOT_FOUND;
        }
        Node temp = head;
        head = head.nextNode; //przypisuje siebie do nastepnika
        int returnedValue = temp.value; //tworzone dla picu
        temp = null; //dzialanie GC tu sie uwidoczni
        size--;

        return returnedValue; //return musi byc na koncu jesli typ inny niz void
    }

    private class Node {
        //element + nastepny wezel
        int value; //dane typu int
        Node nextNode; //nastepny wezel bedacy obiektem tego samego typu

        Node(int value) {
            this.value = value;
        }
    }
}
