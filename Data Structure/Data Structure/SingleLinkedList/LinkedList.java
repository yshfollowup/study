package SingleLinkedList;

public class LinkedList {
    private Node head;      //링크드리스트의 맨 처음 노드(Node 정보를 알아야 하므로 Node타입임)
    private Node tail;      //링크드리스트의 맨 끝 노드(Node 정보를 알아야 하므로 Node타입임)
    private int size = 0;   //링크드리스트에 들어간 노드의 개수 파악할 변수


    public void addHead(int input) {     //head 노드 삽입
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;     //size는 0에서 1이 된다
        if (head.next == null) {  //head의 다음이 없다면(노드가 하나밖에 없다면)
            tail = head;  //head값을 tail에 대입
        }
    }

    public int getHead() {
        return head.data;
    }

    public void addTail(int input) {     //tail 노드 삽입
        Node newNode = new Node(input);
        if (size == 0) {      //링크드리스트 크기가 0이라면
            addHead(input);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public int getTail() {
        return tail.data;
    }

    public Node node(int index) {       //인덱스에 해당하는 노드의 값을 알려주기위한 메서드(내부용)
        Node x = head;      //헤드 노드를 x라는 변수에 대입
        for (int i = 0; i < index; i++) {
            x = x.next;   //x는 head의 정보를 가지고 있고 그 head의 next정보가 있을 때 까지 반복
        }
        return x;
    }

    public void add(int k, int input) {      //원하는 index에 노드 삽입
        if (k == 0) {               //0번째에 값을 추가하고 싶다면
            addHead(input);       //addHead에서 작업하게끔 넘김
        } else {
            Node tmp1 = node(k - 1);      //추가하려는 위치의 앞 노드
            Node tmp2 = tmp1.next;            //추가하려는 위치의 노드
            Node newNode = new Node(input);     //새 노드 생성
            tmp1.next = newNode;                //새 노드를 추가하려는 위치 앞 노드가 가리키게 한다
            newNode.next = tmp2;                //새로운 노드를 하나 뒤로 밀린 노드에 가리킨다
            size++;
            if (newNode.next == null) {   //새로 생성한 노드 뒤에 아무 것도 없다면
                tail = newNode;           //테일을 새로 생성한 노드에 가리킨다
            }
        }
    }


    public int removeFirst() {
        Node tmp = head;
        head = head.next;
        int returnData = tmp.data;
        tmp = null;
        size--;
        return returnData;
    }

    public int remove(int k) {
        if (k == 0) {
            return removeFirst();
        } else {
            Node tmp = node(k - 1);       //삭제하려는 노드 앞 노드
            Node delete = tmp.next;
            tmp.next = tmp.next.next;        //삭제하려는 노드
            int returnData = delete.data;
            if (delete == tail) {
                tail = tmp;
            }
            delete = null;
            size--;
            return returnData;
        }
    }

    public int removeTail() {
        return remove(size - 1);
    }


    public String toString() {           //링크드리스트에 생성된 노드들을 보여주는 메서드
        if (head == null) {   //헤드에 아무것도 없다면
            return "[null]";
        }
        Node tmp = head;
        String str = "[";
        while (tmp.next != null) {
            str += tmp.data + ",";
            tmp = tmp.next;
        }
        str += tmp.data;
        return str + "]";
    }

    public int getSize() {      //링크드리스트의 길이 출력
        return size;
    }

    public int get(int k) {  //링크드리스트에서 원하는 index에 대한 값 출력
        Node tmp = node(k);
        return tmp.data;
    }

    public int indexOf(int data) {   //링크드리스트에서 값을 입력하면 그 값이 위치한 index 출력
        Node tmp = head;
        int index = 0;
        while (tmp.data != data) {
            tmp = tmp.next;
            index++;
            if (tmp.next == null) {
                return -1;
            }
        }
        return index;
    }
}
