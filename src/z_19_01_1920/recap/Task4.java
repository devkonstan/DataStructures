package z_19_01_1920.recap;

public class Task4 {
    public static void main(String[] args) {
        Notifier powiadamiacz = new Notifier("Jaca", 3);
        Notifier powiadamiacz2 = new Notifier("Bolo", 2);

        Thread watek1 = new Thread(powiadamiacz);
        Thread watek2 = new Thread(powiadamiacz2);

        watek1.start();
        watek2.start();
    }
}
