package z_19_01_1920.sorting;

import java.util.Arrays;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=PgBzjlCcFvc
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arrayToSort = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println(Arrays.toString(arrayToSort));
        quickSort(arrayToSort);
        System.out.println("Sorted: " + Arrays.toString(arrayToSort));
    }

    private static void quickSort(int[] arrayToSort) {
        if (arrayToSort.length <= 1) {
            return;
        }

        doQuickSort(arrayToSort, 0, arrayToSort.length - 1);
    }

    private static void doQuickSort(int[] arrayToSort, int begin, int end) {
        if (begin < end) {
            Integer partitionedIndex = partition(arrayToSort, begin, end);
            System.out.println(Arrays.toString(arrayToSort));
            doQuickSort(arrayToSort, begin, partitionedIndex - 1);
            doQuickSort(arrayToSort, partitionedIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int i = begin, j = end;
        int pivot = arr[(begin + end) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;

            while (arr[j] > pivot)
                j--;

            if (i <= j) {
                SortingUtils.swap(arr, i, j);
                i++;
                j--;
            }
        }
        return i;

    }
}
