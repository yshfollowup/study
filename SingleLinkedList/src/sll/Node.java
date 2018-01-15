package sll;

public class Node {
    private int data;   //data 영역
    private Node next;  //다음 노드를 가리킬 영역
    public Node(int input){
        this.data=input;
        this.next=null;
    }

    public String toString(){
        return String.valueOf(this.data);
    }

}
