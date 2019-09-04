package z_18_12_0809.Shop;

import java.util.LinkedList;
import java.util.Queue;

public class Shop {

    private Queue<Client> ListaKolejkowa = new LinkedList<>();

    public void addClient(Client osoba) throws FullQueueException {
        if (ListaKolejkowa.size() < 5) {
            if (osoba.getWiek() < 18) {
                throw new IllegalArgumentException("Underage person: " + osoba.getImie());
            } else
                ListaKolejkowa.add(osoba);
        } else {
            throw new FullQueueException("Cannot be added: " + osoba.getImie());
        }
    }
    //metoda poll sciaga 1.element i nie wyswietla go a peek tylko pokazuje
    public Client serveCustomer() {
        return ListaKolejkowa.peek();
    }

    public Queue<Client> getAll() {
        return ListaKolejkowa;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "ListaKolejkowa=" + ListaKolejkowa +
                '}';
    }

}
