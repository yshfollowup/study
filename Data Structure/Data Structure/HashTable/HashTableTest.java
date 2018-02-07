package ht;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    HashTable newht = new HashTable(7);


    @Test
    public void test01() {
        newht.addData(32);
        newht.addData(17);
        newht.addData(15);
        newht.addData(66);
        assertEquals(4, newht.size);
        assertEquals(32, newht.getKey(32));
        assertEquals(3, newht.getHashIndex(17));
        assertEquals("[0]null [1]15 [2]null [3]17 66 [4]32 [5]null [6]null", newht.toString());
    }

    @Test
    public void test02() {
        newht.addData(47);
        newht.addData(33);
        newht.addData(64);
        assertEquals(14, newht.size);
        assertEquals("[0]null [1]15 64 [2]null [3]17 66 [4]32 [5]47 33 [6]null", newht.toString());
        assertEquals(0, newht.getData(64));

    }

    @Test
    public void test03() {
        newht.removeData(64);
        newht.removeData(47);
        newht.removeData(15);
        assertEquals(14,newht.size);
    }

}