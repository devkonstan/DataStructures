package z_18_12_0809.Shop;

public class FullQueueException extends Throwable {

    public FullQueueException(String message) {
        super(message); //dzieki temu pokaze msg z klasy Shop
        System.out.println("za duzo ludzi!!!");
    }
}
