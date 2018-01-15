package sll;

public class Node {
    public int data;   //저장할 정보(숫자값)
    public Node next;  //다음 노드의 위치, 노드의 정보를 알기 위해 Node 타입 사용

    public Node(int input){
        this.data=input;
        this.next=null;
    }

    public Node(){
        this.toString();
    }

    public String toString(){
        return data + "";   //data의 int 타입을 문자열로 표현하기 위해 toString 오버라이트
    }

}
