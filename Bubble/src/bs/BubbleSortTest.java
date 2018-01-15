package bs;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    int[] raw = new int[]{11,3,24,8,17,21,6,1};
    int[] sorted = new int[]{1,3,6,8,11,17,21,24};

    @Test
    public void bubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        assertArrayEquals(sorted ,bubbleSort.BubbleSort(raw));
    }
}