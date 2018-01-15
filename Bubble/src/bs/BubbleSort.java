package bs;

public class BubbleSort {

    int tmp;    //temporary field for saving data


    public BubbleSort() {
        tmp = 0;
    }

    public int[] BubbleSort(int[] datas) {
        for (int i = 0; i < datas.length - 1; i++) {  //Why is it length-1? : To compare by all datas are changed at once.
            for (int j = 0; j < datas.length - (i + 1); j++) {    //Why is it length-(i+1)? : Not to compare by datas
                if (datas[j] > datas[j + 1]) {
                    tmp = datas[j + 1];
                    datas[j + 1] = datas[j];
                    datas[j] = tmp;
                }
            }
        }
        return datas;
    }

}