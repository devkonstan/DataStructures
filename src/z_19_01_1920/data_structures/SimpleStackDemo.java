package z_19_01_1920.data_structures;


public class    SimpleStackDemo {
    public static void main(String[] args) {
        SimpleStack SS = new SimpleStack();

        System.out.println(SS.isEmpty() ? "Empty" : "Not empty");
        System.out.println("peek: " + SS.peek());
        SS.push(31);
        System.out.println(SS.isEmpty() ? "Empty" : "Not empty");
        System.out.println("peek: " + SS.peek());

        //pop test
        System.out.println();
        SS.push(42);
        SS.push(54);
        SS.push(12);
        SS.push(74);

        while (!SS.isEmpty()) {
            System.out.println(SS.isEmpty() ? "Empty" : "Not empty");
            System.out.println("peek: " + SS.peek());
            System.out.println(SS.pop());

        }

        System.out.println(SS.isEmpty() ? "Empty" : "Not empty");
        System.out.println("peek: " + SS.peek());
    }
}
