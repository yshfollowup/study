public class PriorityQueue {

    public int maxSize;                     //큐의 최대 사이즈
    public int[] queueArray;                //큐(힙)에 대한 value들이 담기는 곳
    public int nItems;                      //들어간 value 개수

    public PriorityQueue(int size) {
        maxSize = size;
        queueArray = new int[size];
        nItems = 0;
    }

    public void enqueue(int value) {
        if (nItems == 0) {
            queueArray[0] = value;          //맨첫번째 배열 인덱스는 무조건 루트 노드임!
        } else {
            int i = nItems;
            while (i > 0 && queueArray[i - 1] > value) {
                queueArray[i] = queueArray[i - 1];          //삽입할 공간을 만들기 위해 모든 요소를 배열의 한칸씩 뒤로 이동
                i--;
            }
            queueArray[i] = value;                          //올바른 위치가 발견되면 그 즉시 value를 삽입
        }
        nItems++;
    }

    public int dequeue() {
        return queueArray[--nItems];
    }

    public int peek() {
        return queueArray[nItems - 1];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int getSize() {
        return nItems;
    }



}
