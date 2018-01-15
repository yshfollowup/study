package qs;

public class QuickSort {
    public int pivot;   //key data for quick sorting
    public int tmp;
    public int[] datas;

    public QuickSort(int[] datas) {
        this.pivot = 0;
        this.tmp = 0;
        this.datas = datas;
    }

    public void Swap(int i, int j) {
        tmp = i;
        i = j;
        j = tmp;
    }

    public int Partition(int[] datas, int left, int right) {
        pivot = datas[0];
        left = 1;
        right = datas[datas.length - 1];
        return 0;
    }

    public void QuickSort() {
        
    }
}
