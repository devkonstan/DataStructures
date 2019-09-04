package z_19_01_1920.sorting;

public class SortingUtils {
    /**
     *        indeksy         0  1  2  3  4
     * @param array np.     [ 6 23 45 76 90 ]
     * @param swappedIndex np. 2
     * @param swappingIndex np. 4
     *
     *  Ponizsza funkcja zamienia ze soba podane elementy danej tablicy
     */
    public static void swap(int[] array, int swappedIndex, int swappingIndex) {
        if(swappedIndex == swappingIndex) {
            return;
        }

        int temp = array[swappedIndex];
        array[swappedIndex] = array[swappingIndex];
        array[swappingIndex] = temp;
    }
}
