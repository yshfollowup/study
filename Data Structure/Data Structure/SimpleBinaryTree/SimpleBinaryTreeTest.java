package sbt;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleBinaryTreeTest {

    SimpleBinaryTree sbt = new SimpleBinaryTree();

    @Test
    public void insertNode() {
        sbt.insertNode(10);
        sbt.insertNode(24);
        sbt.insertNode(5);
        assertEquals(5, sbt.find(5));
    }

    @Test
    public void removeNode() {
        sbt.removeNode(24);
        assertEquals(false, sbt.find(10));
    }

    @Test
    public void searchByPre() {
        sbt.insertNode(15);
        Node start = sbt.find(10);
        assertEquals("[10, 5, 15]", sbt.searchByPre(start));
    }

    @Test
    public void searchByIn() {
        sbt.insertNode(15);
        Node start = sbt.find(5);
        assertEquals("[5, 10, 15]", sbt.searchByIn(start));
    }

    @Test
    public void searchByPost() {
        sbt.insertNode(15);
        Node start = sbt.find(5);
        assertEquals("[5, 15, 10]", sbt.searchByPost(start));
    }
}