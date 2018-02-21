package ms;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    int[] raw = {46, 21, 2, 33, 90, 27, 5, 85};
    int[] sorted = {2, 5, 21, 27, 33, 46, 85, 90};

    @Test
    public void mergeSort() {
        MergeSort ms = new MergeSort();
        ms.MergeSort(raw, 0, raw.length - 1);
        assertArrayEquals(sorted, raw);
    }

}