package sbt;

public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int input) {
        this.data = input;
        this.left = null;
        this.right = null;
    }
}
