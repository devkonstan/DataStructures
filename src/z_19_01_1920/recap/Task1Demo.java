package z_19_01_1920.recap;

import java.util.Arrays;
import java.util.List;

public class Task1Demo {
    public static void main(String[] args) {

        Integer[] arrayToBePrinted = {1, 2, 3, 4, 5, 6};
        List<Integer> targetList = Arrays.asList(arrayToBePrinted);

        print(arrayToBePrinted);
        System.out.println("********");
        printOdd(arrayToBePrinted, true);
        System.out.println("********");
        printOddOrEven(targetList, false);

    }

    private static void print(Integer[] arrayToBePrinted) {
        System.out.println("Command-line arguments:");
        for (int i = 0; i < arrayToBePrinted.length; i = i + 2) {
            System.out.println(arrayToBePrinted[i]);
        }
    }

    private static void printOdd(Integer[] arrayToBePrinted, boolean printOdd) {
        for (int i = 0; i < arrayToBePrinted.length; i++) {
            // odd
            if (printOdd && arrayToBePrinted[i] % 2 == 1) {
                System.out.println(arrayToBePrinted[i]);
            }
            // even
            if (!printOdd && arrayToBePrinted[i] % 2 == 0) {
                System.out.println(arrayToBePrinted[i]);
            }
        }
    }

    private static void printOddOrEven(List<Integer> arrayToBePrinted, boolean printOdd) {
        for (int i = 0; i < arrayToBePrinted.size(); i++) {
            // odd
            if (printOdd && arrayToBePrinted.get(i) % 2 == 1) {
                System.out.println(arrayToBePrinted.get(i));
            }
            // even
            if (!printOdd && arrayToBePrinted.get(i) % 2 == 0) {
                System.out.println(arrayToBePrinted.get(i));
            }

        }
    }
}