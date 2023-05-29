package leasson1.insertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] array = {5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(insertionSort.insertionSort(array)));
    }
}
