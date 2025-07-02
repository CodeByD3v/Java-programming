class Node{
    int data;
    Node next ; 

    Node(int val){
        data = val;
        next = null;
    }
}

public class LinkedList {
    public static void main(String[] args){
        Node Node1 = new Node(12);
        Node Node2 = new Node(18);

        Node1.next = Node2;

        System.out.println(Node1.data);
        System.out.print(Node1.next);
        System.out.println();

        System.out.println(Node2.data);
        System.out.println(Node2.next);

        System.out.print(Node1.next.data);
    }
}
