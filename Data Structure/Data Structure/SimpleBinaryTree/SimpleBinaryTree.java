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
                    break;
                }
            } else {
                current = current.right;
                if (current == null) {
                    current = node;
                    parent.right = current;
                    break;
                }
            }
        }
    }

    public int removeNode(int input) {
        Node node = new Node(input);
        Node remove = rootNode;
        Node parent = null;

        while (remove.data != input) {
            parent = remove;
            if (remove.data > input) {
                remove = remove.left;
            } else {
                remove = remove.right;
            }
        }

        if (remove.left == null && remove.right == null) {       //no child from parent's node
            if (remove == rootNode) {
                rootNode = null;
            } else if (remove == parent.left) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (remove.left == null) {                        //Only right child from parent's node
            if (remove == rootNode) {
                rootNode = remove.right;
            } else if (remove == remove.left) {
                parent.left = remove.right;
            } else {
                parent.right = remove.right;
            }
        } else if (remove.right == null) {                      //Only left child from parent's node
            if (remove == rootNode) {
                rootNode = remove.left;
            } else if (remove == remove.left) {
                parent.left = remove.left;
            } else {
                parent.right = remove.left;
            }
        } else {
            Node replace = remove;

        }


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
