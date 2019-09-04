package z_19_01_1920.sorting;

import java.util.Arrays;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=PgBzjlCcFvc
 */
public class QuickSortNew {
    public static void main(String[] args) {
        int arrayToSort[] = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
        System.out.println("Initial: " + Arrays.toString(arrayToSort));
        quickSort(arrayToSort);
        System.out.println("Sorted: " + Arrays.toString(arrayToSort));
    }

    private static void quickSort(int[] arrayToSort) {

        doQuickSort(arrayToSort, 0, arrayToSort.length - 1);
    }

    private static void doQuickSort(int[] arrayToSort, int begin, int end) {
        if(arrayToSort.length <= 1) {
            return;
        }

        if(begin < end) {
            int partitionIndex = partition(arrayToSort, begin, end);
            doQuickSort(arrayToSort, begin, partitionIndex - 1);
            doQuickSort(arrayToSort, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}