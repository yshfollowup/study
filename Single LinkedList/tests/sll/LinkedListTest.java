package sll;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList list = new LinkedList();

    @Test
    public void addHead() {
        list.addHead(10);
        assertEquals(10, list.getHead());
    }

    @Test
    public void addTail() {
        list.addTail(50);
        assertEquals(50,list.getTail());
    }

    @Test
    public void add() {
        for(int i=1; i<=3; i++){
            list.add(i,(i*10)+10);
        }
        String result = list.toString();
        assertEquals("[10,20,30,40,50]",result);
    }


    @Test
    public void removeFirst() {
        int result = list.removeFirst();
        assertEquals(10,result);
    }

    @Test
    public void removeTail() {
        int result = list.removeTail();
        assertEquals(50,result);
    }

    @Test
    public void remove() {
        list.remove(1);
        String result = list.toString();
        assertEquals("[20,40]",result);
    }


    @Test
    public void getSize() {
        int result = list.getSize();
        assertEquals(0,result);
    }

    @Test
    public void get() {
        int result = list.get(2);
        assertEquals(null,result);
    }

    @Test
    public void indexOf() {
        int result = list.indexOf(30);
        assertEquals(null,result);
    }
}