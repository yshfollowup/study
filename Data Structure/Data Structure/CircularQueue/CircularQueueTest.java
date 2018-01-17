package CircularQueue;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CircularQueueTest {

    CircularQueue circularQueue = new CircularQueue (5);

    @Test
    public void enqueue() {
        for (int i = 0; i < circularQueue.capacity; i++) {
            circularQueue.Enqueue(i * 10);
        }
        assertEquals (5, circularQueue.getSize());
        assertEquals (10, circularQueue.nodes[1]);
    }

    @Test
    public void dequeue() {
        circularQueue.Dequeue();
        assertEquals (5,circularQueue.getSize());
        assertEquals(0,circularQueue.Dequeue());
    }
}