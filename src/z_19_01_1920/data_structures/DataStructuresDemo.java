package z_19_01_1920.data_structures;

public class DataStructuresDemo {
    public static void main(String[] args) {
        SimpleLinkedListNew simpleLinkedList = new SimpleLinkedListNew();
        simpleLinkedList.append(2);
        simpleLinkedList.append(122);
        simpleLinkedList.prepend(44);
        simpleLinkedList.insert(10, 2);
        System.out.println(simpleLinkedList.get(2));
        simpleLinkedList.remove(2);
        System.out.println(simpleLinkedList.get(1));

        System.out.println();

        SimpleStack simpleStack = new SimpleStack();
        System.out.println(simpleStack.isEmpty());
        simpleStack.push(10);
        simpleStack.push(30);
        System.out.println(simpleStack.isEmpty());
        System.out.println(simpleStack.peek());
        simpleStack.pop();
        System.out.println(simpleStack.peek());
        simpleStack.pop();
        System.out.println(simpleStack.peek());
    }
}
