package is;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertSortTest {

    int[] raw = new int[]{11, 3, 24, 8, 17, 21, 6, 1};
    int[] sorted = new int[]{1, 3, 6, 8, 11, 17, 21, 24};

    @Test
    public void insertSort() {
        InsertSort insertSort = new InsertSort();
        assertArrayEquals(sorted, insertSort.InsertSort(raw));
    }
}