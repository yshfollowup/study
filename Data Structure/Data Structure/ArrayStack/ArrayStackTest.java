package as;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStackTest {

    ArrayStack as = new ArrayStack(5);      //스택 생성(이름 : as)

    @Test
    public void isEmpty() {
        boolean result = as.isEmpty();
        assertEquals(true, result);
    }

    @Test
    public void push() {
        for (int i = 1; i <= 5; i++) {
            as.push(i * 10);
        }
        int result = as.getSize();
        assertEquals(5, result);
    }

    @Test
    public void getTop() {
        as.push(60);
        int result = as.getTop();
        assertEquals("Stack Overflow is occured!!!", -1, result);
    }

    @Test
    public void pop() {
        int result = as.pop();
        assertEquals(50, result);
    }
}