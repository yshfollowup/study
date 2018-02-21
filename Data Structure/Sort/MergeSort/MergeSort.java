package ms;

public class MergeSort {
    public int[] temp = new int[30];

    public void MergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;
            MergeSort(arr, left, mid);
            MergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i++];
            } else {
                temp[k] = arr[j++];
            }
            k++;
        }

        if (i > mid) {
            for (int l = j; l <= right; l++, k++) {
                temp[k] = arr[l];
            }
        } else {
            for (int l = i; l <= mid; l++, k++) {
                temp[k] = arr[l];
            }
        }

        for (int l = left; l <= right; l++) {
            arr[l] = temp[l];
        }
    }
}
