package sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {
    private int[][] array = {
            {0, 0, 0, 0},
            {},
            {1, 2, 3, 4},
            {4, 3, 2, 1},
            {4, 5, 10, -1}
    };

    @Test
    public void sort() {
        for (int[] ints : array) {
            int[] result = new BubbleSort().sort(ints);
            Arrays.sort(ints);
            Assert.assertArrayEquals(result, ints);
            System.out.println(Arrays.toString(result));
        }

    }
}