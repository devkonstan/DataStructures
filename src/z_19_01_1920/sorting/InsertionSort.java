package z_19_01_1920.sorting;

import java.util.Arrays;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=OGzPmgsI-pQ
 */
public class InsertionSort {
    public static void main(String[] args) {
        int arrayToSort[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("Initial: " + Arrays.toString(arrayToSort));
        insertionSort(arrayToSort);
        System.out.println("Sorted: " + Arrays.toString(arrayToSort));
    }

    private static void insertionSort(int[] arrayToSort) {
        if (arrayToSort.length <= 1) {
            return;
        }

        int i, j, unsortedElement;

        for (i = 1; i < arrayToSort.length; i++) {
            unsortedElement = arrayToSort[i];
            j = i - 1;

            while (j >= 0 && arrayToSort[j] > unsortedElement) {
                arrayToSort[j + 1] = arrayToSort[j];
                j = j - 1;
            }
            arrayToSort[j + 1] = unsortedElement;
        }
    }
}