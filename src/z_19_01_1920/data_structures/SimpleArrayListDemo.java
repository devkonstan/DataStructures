package z_19_01_1920.data_structures;

public class SimpleArrayListDemo {
    public static void main(String[] args) {
        SimpleArrayList SAL = new SimpleArrayList();
        System.out.println(SAL.isEmpty());
        SAL.add(10);
        SAL.add(10);
        SAL.add(10);
        SAL.add(10);
        SAL.add(10);
        SAL.add(10);
        SAL.add(10);
        SAL.add(10);
        SAL.add(10);
        SAL.add(1);
        SAL.add(1);
        System.out.println(SAL.getSize());
        System.out.println(SAL.isEmpty());
    }


}
