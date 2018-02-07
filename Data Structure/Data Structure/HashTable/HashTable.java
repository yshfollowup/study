package ht;

//by 분리연결법

public class HashTable {
    public int size;
    public Node[] hashTable;

    public HashTable(int size) {
        this.size = size;
        hashTable = new Node[size];
    }

    public int getHashIndex(int key) {      // key 값으로 HashTable에 저장될 index를 반환
        return key % size;                  //size를 key값으로 나눈 나머지가 인덱스가 된다
    }

    public int getKey(int data) {           //저장할 데이터로 key를 추출
        return data;
    }

    public int addData(int data) {
        int key = getKey(data);
        int hashValue = getHashIndex(key);

        Node newNode = new Node();
        newNode.data = data;

        if (hashTable[hashValue] == null) {
            hashTable[hashValue] = newNode;
            return 0;
        }

        Node pre = null;
        Node cursor = hashTable[hashValue];

        while (true) {
            if (hashTable.length >= (size * 0.75)) {
                size = size * 2;
            }else {

                if (cursor == null) {               //현재 노드의 위치가 없다면(해쉬테이블 공간이 비어있다면)
                    hashTable[hashValue] = newNode;
                    return 0;
                } else if (cursor.data < key) {      //현재 노드의 값이 키값보다 작다면
                    pre = cursor;                     //cursor를 하나 뒤로 옮긴다
                    cursor = cursor.next;
                } else {                             //노드의 값이 키값보다 클 때(이 때 저장됨)
                    if (cursor == hashTable[hashValue]) {       //cursor 노드가 해쉬 테이블의 첫 번째 노드라면
                        newNode.next = cursor;                  //cursor를 다음 노드로 지정하고 삽입될 노드를 첫번째로 삽입한다
                        hashTable[hashValue] = newNode;
                        return 0;
                    } else {                                    //첫 번째가 아니면
                        newNode.next = cursor;                  //삽입 노드의 다음 노드로 커서 노드를 지정하고
                        pre.next = newNode;                     //전 노드의 다음을 삽입 노드로 지정한다
                        return 0;
                    }
                }
            }
        }
    }


    public int getData(int data) {
        int key = getKey(data);
        int hashValue = getHashIndex(key);

        Node cursor = hashTable[hashValue];            //data가 있는 index의 첫번째 노드를 얻는다

        while (true) {
            if (cursor == null) {
                return -1;                              //해쉬 테이블이 비어있다면 -1 반환
            } else if (cursor.data == key) {
                return hashValue;                       //cursor의 값과 키가 같다면 0반환
            } else if (cursor.data > key) {
                return 1;                              //cursor의 값이 키보다 크면 1 반환(why? 리스트는 작은값부터 큰값으로 정렬되어있다고 가정했기 때문에)
            } else {
                cursor = cursor.next;                 //cursor의 값이 키보다 작으면 다음 노드로 이동
            }
        }
    }

    private Node getNode(int data) {
        int key = getKey(data);
        int hashValue = getHashIndex(key);

        Node pre = hashTable[hashValue];
        Node cursor = pre.next;

        while (true) {
            if (cursor == null) {
                return null;
            } else if (cursor.data == key) {      //cursor의 노드와 키값이 같다면 이전 노드를 반환
                return pre;
            } else if (cursor.data < key) {
                pre = cursor;
                cursor = cursor.next;
            } else {                             //cursor의 값이 키값보다 크다면 null 반환
                return null;
            }
        }
    }

    public int removeData(int data) {
        Node pre = null;
        pre = getNode(data);

        if (pre == null) {
            return -1;
        }

        Node cursor = pre.next;
        pre.next = cursor.next;
        return 0;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        Node cursor = null;

        for (int i = 0; i < size; i++) {
            result.append("[" + i + "]");
            cursor = hashTable[i];
            if (cursor == null) {
                result.append("null ");
            } else {
                while (cursor != null) {
                    result.append(cursor.data + " ");
                    cursor = cursor.next;
                }
            }

        }
        return result.toString();
    }

}
