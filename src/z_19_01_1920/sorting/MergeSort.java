package z_19_01_1920.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int arrayToSort[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println(Arrays.toString(arrayToSort));
        mergeSort(arrayToSort);
        System.out.println("Sorted: " + Arrays.toString(arrayToSort));
    }

    private static void mergeSort(int[] arr) {
        doMergeSort(arr, 0, arr.length - 1);
    }

    private static void doMergeSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int middleIndex = (end + begin) / 2;
            doMergeSort(arr, begin, middleIndex);
            doMergeSort(arr, middleIndex + 1, end);
            merge(arr, begin, middleIndex, end);
        }
    }

    private static void merge(int[] arr, int begin, int middle, int end) {
        int leftSubarraySize = middle - begin + 1;
        int rightSubarraySize = end - middle;

        int leftSubarray[] = new int[leftSubarraySize];
        int rightSubarray[] = new int[rightSubarraySize];

        for (int i = 0; i < leftSubarraySize; i++) {
            leftSubarray[i] = arr[begin + i];
        }

        for (int i = 0; i < rightSubarraySize; i++) {
            rightSubarray[i] = arr[middle + 1 + i];
        }

        int i = 0, j = 0;

        int k = begin;
        while (i < leftSubarraySize && j < rightSubarraySize) {
            if (leftSubarray[i] <= rightSubarray[j]) {
                arr[k] = leftSubarray[i];
                i++;
            } else {
                arr[k] = rightSubarray[j];
                j++;
            }
            k++;
        }

        while (i < leftSubarraySize) {
            arr[k] = leftSubarray[i];
            i++;
            k++;
        }

        while (j < rightSubarraySize) {
            arr[k] = rightSubarray[j];
            j++;
            k++;
        }
    }

}
