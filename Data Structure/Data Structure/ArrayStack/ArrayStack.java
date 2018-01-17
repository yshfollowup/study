package ArrayStack;

public class ArrayStack {
    public int size;        //스택의 최대 크기
    public int top=0;         //스택의 맨 위부분
    public int[] nodes;     //노드들을 담을 배열

    public ArrayStack(int size){
        this.size=size;
        nodes = new int[size];

    }

    public boolean isEmpty(){
        boolean empty=false;
        if(this.top==0){
            empty=true;
        }
        return empty;
    }

    public void push(int input){
        if(top<nodes.length){
            nodes[top] = input;
            top++;
        }else{
            System.out.println("Stack Overflow is Occured!!!"); //더 이상 쌓을 게 없다면(Overflow)
        }
        //int pos = this.top;
       // this.nodes[pos]=input;
       // this.top++;

    }

    public int topData(){
        int pos = this.top - 1;
        return this.nodes[pos];
    }

    public int getTop(){        //top의 위치 구하는 메서드
        if(top>size){
            return -1;
        }else{
            return top;
        }
    }

    public int pop(){
        if(top > 0){
            return nodes[--top];
        }else{
            this.isEmpty();
            return -1;  //더 이상 지울게 없다면 -1 반환(Underflow)
        }
    }

    public int getSize(){
        return size;
    }
}
