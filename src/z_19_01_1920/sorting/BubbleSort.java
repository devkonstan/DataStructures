package z_19_01_1920.sorting;


/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/wa tch?v=nmhjrI-aW5o
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arrayToSort[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arrayToSort.length; i++){
            System.out.print(arrayToSort[i] + " ");
        }
        System.out.println();

        bubbleSort(arrayToSort);

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arrayToSort.length; i++){
            System.out.print(arrayToSort[i] + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) { //petla porownujaca poszczegolne elementy
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    SortingUtils.swap(arr,j-1,j);
//                    tmp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = tmp;
                }

            }
        }
    }
}
