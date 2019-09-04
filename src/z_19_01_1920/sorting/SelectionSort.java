package z_19_01_1920.sorting;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=xWBP4lzkoyM
 */
public class SelectionSort {
    public static void main(String[] args) {
        int arrayToSort[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        System.out.println("Before Selection Sort");
        for (int i : arrayToSort) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arrayToSort);//sorting array using selection sort

        System.out.println("After Selection Sort");
        for (int i : arrayToSort) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            SortingUtils.swap(arr, index, i);
//            int smallerNumber = arr[index];
//            arr[index] = arr[i];
//            arr[i] = smallerNumber;
        }
    }
}

