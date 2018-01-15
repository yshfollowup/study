package cq;

public class CircularQueue {
    public int capacity;                //length of array
    public int front;                   //A starting point and an exit of datum
    public int rear;                    //An ending point and an entrance of datum
    public int[] nodes;                 //The array that circularqueue is implemented in reality

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.rear = 0;
        this.nodes = new int[capacity];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        if (front < rear) {
            return (rear - front) == capacity;
        } else {
            return (rear + 1) == front;
        }
    }

    public void Enqueue(int input) {
        int pos = 0;                      //A point that somethings happened(such as insert or remove)
        if (rear == capacity + 1) {
            rear = 0;
            pos = 0;
        } else {
            pos = rear++;
        }
        nodes[pos] = input;
    }

    public int getSize() {
        if (front <= rear) {
            return rear - front;
        } else {
            return rear + (capacity - front) + 1;
        }
    }

    public int Dequeue() {
        int pos = front;
        if (front == capacity) {
            front = 0;
        } else {
            front++;
        }
        return nodes[pos];
    }
}
