package is;

public class InsertSort {
    int tmp;
    int index;

    public InsertSort() {
        tmp = 0;
        index = 0;
    }

    public int[] InsertSort(int[] datas) {
        for (int i = 1; i < datas.length; i++) {
            if (datas[i - 1] <= datas[i]) {
                continue;
            }
            tmp = datas[i];
            index = i - 1;

            while (index >= 0 && tmp < datas[index]) {      //
                datas[index + 1] = datas[index];
                index--;
            }
            datas[index + 1] = tmp;
        }
        return datas;
    }
}
