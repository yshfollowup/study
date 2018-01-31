package sbt;

/*
Completed on 2018-01-23
Implement SimpleBinaryTree
 */
public class SimpleBinaryTree {
    private Node rootNode;

    public SimpleBinaryTree() {
        rootNode = null;
    }

    public Node find(int key) {
        Node current = rootNode;        //@var(current) : 루트 노드의 정보를 알고 있다
        while (current != null) {
            if (key < current.data) {
                current = current.left;
            } else if (key > current.data) {
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }

    public void insertNode(int input) {
        Node node = new Node(input);

        if (rootNode == null) {
            rootNode = node;
        }else {
            Node parent = find(input);
            if(input >= parent.data) {
                parent.right=node;
                parent.right.parent = parent;
                return;
            }else {
                parent.left=node;
                parent.left.parent = parent;
                return;
            }
        }
    }



    public boolean removeNode(int input) {
        Node tmp = find(input);
        if(tmp.data != input)
            return false;

        if(tmp.left == null && tmp.right == null) {             //자식이 없을 때(leaf)
            if(tmp == rootNode) {
                rootNode = null;
            }else if(tmp.parent.data < tmp.data) {
                tmp.right = null;
            }else {
                tmp.left = null;
            }
            return true;
        }else if(tmp.left != null && tmp.right != null) {       //자식이 왼쪽 오른쪽 모두 있을 때
            Node successor = findSuccessor(tmp);
            successor.left = tmp.left;
            successor.left.parent = successor;

            if(successor.right != null && successor.parent != tmp) {
                successor.right.parent = successor.parent;
                successor.parent.left = successor.right;
                successor.right = tmp.right;
                successor.right.parent = successor;
            }

            if(tmp == rootNode) {
                successor.parent = null;
                rootNode = successor;
                return true;
            }else {
                successor.parent = tmp.parent;
                if(tmp.parent.data < tmp.data)
                    tmp.parent.right = successor;
                else
                    tmp.parent.left = successor;
                return true;
            }


        }else {                                                        //자식이 왼쪽 or 오른쪽 하나만 있을 때
            if(tmp.right == null) {
                if(tmp == rootNode) {
                    rootNode = tmp.left;
                    return true;}


                    tmp.left.parent = tmp.parent;

                    if(tmp.data < tmp.parent.data)
                        tmp.parent.left = tmp.left;
                    else
                        tmp.parent.right = tmp.left;
                    return true;
                } else {
                if(tmp == rootNode) {
                    rootNode = tmp.right;
                    return true;}

                    tmp.right.parent = tmp.parent;

                    if(tmp.data < tmp.parent.data)
                        tmp.parent.left = tmp.right;
                    else
                        tmp.parent.right = tmp.right;
                    return true;
                }
            }
        }
        /*
        삭제된 노드 대신에 들어갈 successor를 찾는 메서드
        successor란? - 삭제된 노드 기준으로 오른쪽 하위 트리 중 최솟값을 가지는 노드
        */
        public Node findSuccessor(Node node) {
            if(node.right == null)
                return node;
            Node current = node.right;
            Node parent = node.right;
            while(current != null) {
                parent = current;
                current = current.left;
            }
            return parent;
        }

        public void searchByPre(Node localRoot) {
            if(localRoot != null) {
                System.out.print(localRoot.data + " ");
                System.out.print(localRoot.left + " ");
                System.out.print(localRoot.right + " ");
            }
        }

        public void searchByIn(Node localRoot) {
            if(localRoot != null) {
                System.out.print(localRoot.left + " ");
                System.out.print(localRoot.data + " ");
                System.out.print(localRoot.right + " ");
            }
        }

        public void searchByPost(Node localRoot) {
            if(localRoot != null) {
                System.out.print(localRoot.left + " ");
                System.out.print(localRoot.right + " ");
                System.out.print(localRoot.data + " ");
            }
        }
    }



