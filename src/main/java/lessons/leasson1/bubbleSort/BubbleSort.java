package lessons.leasson1.bubbleSort;

public class BubbleSort {

    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean changed = false;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    changed = true;
                }
                if (!changed) break;
            }
        }
        return array;
    }
}
