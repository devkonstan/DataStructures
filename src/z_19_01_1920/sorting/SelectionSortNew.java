package z_19_01_1920.sorting;

import java.util.Arrays;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=xWBP4lzkoyM
 */
public class SelectionSortNew {
    public static void main(String[] args) {
        int arrayToSort[] = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
        System.out.println("Initial: " + Arrays.toString(arrayToSort));
        selectionSort(arrayToSort);
        System.out.println("Sorted: " + Arrays.toString(arrayToSort));
    }

    private static void selectionSort(int[] arrayToSort) {
        if(arrayToSort.length <= 1) {
            return;
        }

        int unsortedPointer = 0;

        while(unsortedPointer < arrayToSort.length) {
            int minIndex = unsortedPointer;

            for(int i = unsortedPointer; i < arrayToSort.length; i++) {
                if(arrayToSort[i] < arrayToSort[minIndex]) {
                    minIndex = i;
                }
            }
            SortingUtils.swap(arrayToSort, unsortedPointer, minIndex);
            unsortedPointer++;
        }
    }
}
