package lessons.leasson1.bubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(array)));
    }
}
