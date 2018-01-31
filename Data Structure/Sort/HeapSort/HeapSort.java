package hs;

public class HeapSort {
    public int[] heap;
    public int size;

    public HeapSort(int size) {
        this.size = size;
        heap = new int[size];
    }

    public HeapSort(int[] heap) {
        this.heap = heap;
        size = heap.length;
    }

    public void buildHeap(int input) {
        for (int i = (input - 1) / 2; i >= 0; i--) {        //
            heapify(i, input);
        }
    }

    //@param small : 비교하려는 두 수중 더 작은 값
    //@param big : 비교하려는 두 수중 더 큰 값
    public void heapify(int small, int big) {
        int current = small;
        int child = current * 2 + 1;                       //current에 해당하는 자식 노드, 배열의 형태이기 때문에 +1해줌
        if (child <= big) {                                //자식노드가 큰 값보다 작으면
            if (child + 1 < big) {                         //오른쪽 자식 노드가 큰 값보다 작으면
                if (heap[child] < heap[child + 1]) {      //왼쪽 자식보다 오른쪽 자식이 더 클 때
                    child++;
                }
            }
            if (heap[current] < heap[child]) {
                swap(current, child);
                heapify(child, big);                        //왼쪽 자식과 큰 값
                heapify(child + 1, big);
            }
        }
    }

    private void swap(int current, int child) {
        int tmp = 0;
        if (current != child) {
            heap[tmp] = heap[child];
            heap[child] = heap[current];
            heap[current] = heap[tmp];
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + ",");
        }
        System.out.println();
    }

    public int[] sort() {
        for(int i = size - 1; i>=1; i--) {
            buildHeap(i);
            swap(0,i);
        }
        return heap;
    }





}
