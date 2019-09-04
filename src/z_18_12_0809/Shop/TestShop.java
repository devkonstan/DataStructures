package z_18_12_0809.Shop;

public class TestShop {
    private static Shop kolejka = new Shop();

    public static void main(String[] args) {

        try {
            kolejka.addClient(new Client("Andrzej", "Nowak", 23));
            kolejka.addClient(new Client("Michał", "Kowalski", 18));
            //kolejka.addClient(new Person("Błażej", "Rak", 13));
            kolejka.addClient(new Client("Grzegorz", "Stec", 73));
            kolejka.addClient(new Client("Radek", "Hilc", 23));
            kolejka.addClient(new Client("Sławek", "Kupski", 53));
            kolejka.addClient(new Client("Bartosz", "Cieslak", 63));
        } catch (FullQueueException fqe) {
            System.out.println(fqe.getMessage());

        }

        System.out.println(kolejka);

        System.out.println("*******");

        kolejka.serveCustomer();

        for (Client customer : kolejka.getAll()) {
            System.out.println(customer);
        }

        System.out.println("*******");

        try {
            kolejka.addClient(new Client("Jan", "Kopeć", 13));
        } catch (IllegalArgumentException | FullQueueException e) {
            System.out.println(e.getMessage());
        }
    }
}
