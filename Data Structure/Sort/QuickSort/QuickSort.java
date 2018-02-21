package qs;

public class QuickSort {

    public void QuickSort(int[] datas, int begin, int end) {
        if (begin < end) {
            int pivot = Partition(datas, begin, end);
            QuickSort(datas, begin, pivot - 1);
            QuickSort(datas, pivot + 1, end);
        }
    }

    public void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }


    public int Partition(int[] datas, int begin, int end) {
        int left = begin;
        int right = end;
        int pivot = (left + right) / 2;

        while(left < right) {
            while(datas[left] < datas[pivot] && (left < right)) {
                left++;
            }while (datas[right] >= datas[pivot] && (left < right)) {
                right--;
            }
            if(left < right) {
               swap(datas, left, right);
            }
        }
        swap(datas, left, right);
        return left;
    }
}
