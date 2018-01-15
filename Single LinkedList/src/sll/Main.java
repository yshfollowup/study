package sll;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addHead(10);
        ll.addTail(50);
        for(int i=1; i<=3; i++){
            ll.add(i,(i*10)+10);
        }
        System.out.println(ll.node(2));
        System.out.println(ll.toString());
        System.out.println(ll.getSize());
        System.out.println(ll.removeFirst());
        System.out.println(ll.toString());
        System.out.println(ll.removeTail());
        System.out.println(ll.toString());

        System.out.println(ll.remove(1));
        System.out.println(ll.toString());
        System.out.println(ll.get(1));
        System.out.println(ll.indexOf(20));
    }
}
