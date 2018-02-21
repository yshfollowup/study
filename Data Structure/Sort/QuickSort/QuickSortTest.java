package qs;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    int[] raw = {46, 21, 2, 33, 90, 27, 5, 85};
    int[] sorted = {2, 5, 21, 27, 33, 46, 85, 90};


    @Test
    public void quickSort() {
        QuickSort quickSort = new QuickSort();
        quickSort.QuickSort(raw, 0, raw.length - 1);
        assertArrayEquals(sorted, raw);
    }
}