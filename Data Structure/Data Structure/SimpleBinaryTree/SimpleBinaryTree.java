package SimpleBinaryTree;

/*
Completed on 2018-01-15
Implement SimpleBinaryTree
 */
public class SimpleBinaryTree {

    private Node rootNode;

    public void insertNode(int input) {
        Node node = new Node(input);
        if (rootNode == null) {
            rootNode = node;
        }

        Node current = rootNode;    //having an information about rootNode
        Node parent = null;         //high rank node of current

        while (true) {
            parent = current;
            if (current.data > input) {
                current = current.left;
                if (current == null) {
                    current = node;
                    parent.left = current;
                }
            } else {
                current = current.right;
                if (current == null) {
                    current = node;
                    parent.right = current;
                }
            }
        }
    }

    public int removeNode(int input) {
        Node node = new Node(input);
        Node current = rootNode;
        Node parent = null;

        return 0;
    }

    public String searchByPre() {

        return null;
    }

    public String searchByIn() {
        return null;
    }

    public String searchByPost() {
        return null;
    }

    public void getMax() {

    }

    public void getMin() {

    }
}
