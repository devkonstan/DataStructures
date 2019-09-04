package z_19_01_1920.data_structures;


public class SimpleQueuedemo {
    public static void main(String[] args) {
        SimpleQueue SQ = new SimpleQueue();

        System.out.println(SQ.isEmpty() ? "Empty" : "Not empty");
        System.out.println("peek: " + SQ.peek());
        SQ.enqueue(23);
        System.out.println(SQ.isEmpty() ? "Empty" : "Not empty");
        System.out.println("peek: " + SQ.peek());
        SQ.enqueue(23);
        SQ.enqueue(654);
        SQ.enqueue(35);
        SQ.enqueue(463);
        System.out.println(SQ.isEmpty() ? "Empty" : "Not empty");
        System.out.println("peek: " + SQ.peek());

        //dequeue
        System.out.println("rozladowanie kolejki: ");
        while (!SQ.isEmpty()) { //mechanizm odwrocenia metody isEmpty -> jesli 1 to dziala
            int deletedValue = SQ.dequeue();
            System.out.println(deletedValue);
        }
        System.out.println(SQ.isEmpty() ? "Empty" : "Not empty");
    }
}
