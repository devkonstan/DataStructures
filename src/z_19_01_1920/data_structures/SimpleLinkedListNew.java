package z_19_01_1920.data_structures;

/**
 * https://visualgo.net/en/list
 *
 * Zaimplementuj liste wiazana jednokierunkowa, przechowujaca dane typu int
 * Lista powininna posiadac nastepujace metody:
 *  - prepend - dodaje element na poczatek listy
 *  - append - dodaje element na koniec listy
 *  - insert - dodaje element na zadanym indeksie
 *  - remove - usuwa element na podanym indeksie z listy
 *  - getSize() - zwraca ilosc elementow w liscie
 *  - isEmpty - sprawdza czy lista jest pusta
 */
public class SimpleLinkedListNew {
    private Node head;
    private Node tail;
    private int size;

    public void prepend(int element) {
        Node newNode = new Node(element);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
           Node temp = head;
           head = newNode;
           head.nextNode = temp;
        }
        size++;
    }

    public void append(int element) {
        Node newNode = new Node(element);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = tail;
            tail = newNode;
            temp.nextNode = tail;
        }
        size++;
    }

    public void insert(int element, int index) {
        if(index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        Node previous = head;

        for(int i = 0; i < index - 1; i++) {
            previous = previous.nextNode;
        }

        Node after = previous.nextNode;
        Node newNode = new Node(element);
        newNode.nextNode = after;
        previous.nextNode = newNode;
        size++;
    }

    public void remove(int index) {
        if(isEmpty())
            return;

        if(index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if(index == 0) {
            Node temp = head;
            head = head.nextNode;
            temp = null;
        } else if(index == size - 1) {
            Node previous = head;
            Node current = head.nextNode;

            while (current.nextNode != null) {
                previous = previous.nextNode;
                current = current.nextNode;
            }

            previous.nextNode = null;
            current = null;
            tail = previous;
        } else {
            Node previous = head;

            for(int i = 0; i < index - 1; i++) {
                previous = previous.nextNode;
            }

            Node deletedNode = previous.nextNode;
            previous.nextNode = deletedNode.nextNode;
            deletedNode = null;
        }
        size--;
    }

    public int get(int index) {
        if(index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        Node current = head;

        for(int i = 0; i < index; i++) {
            current = current.nextNode;
        }
        return current.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    private class Node {
        int value;
        Node nextNode;

        Node(int value) {
            this.value = value;
        }
    }
}
