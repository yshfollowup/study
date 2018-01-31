import org.junit.Test;

import static org.junit.Assert.*;

public class PriorityQueueTest {

    PriorityQueue pq = new PriorityQueue(5);

    @Test
    public void enqueue() {
        pq.enqueue(2);
        pq.enqueue(14);
        pq.enqueue(3);
        pq.enqueue(22);
        pq.enqueue(5);
        assertEquals(5, pq.getSize());
        assertEquals(22, pq.peek());
        assertEquals(true, pq.isFull());
       // pq.enqueue(27);
        //assertEquals(27, pq.peek());                //maxSize를 초과하면 가장 큰 값(우선순위가 높은 값)이 바뀔까?
    }

    @Test
    public void dequeue() {
        String actual = "[";
        for (int i = 4; i >= 0; i--) {
            actual += pq.dequeue() + ", ";
        }
        actual += "]";
        String expect = "[2, 3, 5, 14, 22]";
        assertEquals(false, expect == actual);
    }


    @Test
    public void isEmpty() {
        assertEquals(true, pq.isEmpty());
    }

    @Test
    public void isFull() {
        assertEquals(false, pq.isFull());
    }


}