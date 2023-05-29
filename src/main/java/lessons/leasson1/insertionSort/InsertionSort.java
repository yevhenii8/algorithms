package lessons.leasson1.insertionSort;

public class InsertionSort {

    public int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            while (i >= 1 && array[i - 1] > key) {
                array[i] = array[i - 1];
                i = i - 1;
            }
            array[i] = key;
        }
        return array;
    }
}
