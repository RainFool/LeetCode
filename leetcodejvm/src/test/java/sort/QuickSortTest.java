package sort;

import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {

    private int[][] array = {
            {0, 0, 0, 0},
            {},
            {1, 2, 3, 4},
            {4, 3, 2, 1},
            {4, 5, 10, -1},
            {2, 8, 7, 1, 3, 5, 6, 4}
    };


    @Test
    public void sort() {
        for (int[] a : array) {
            new QuickSort().sort(a, 0, a.length - 1);
            System.out.println(Arrays.toString(a));
        }
    }
}