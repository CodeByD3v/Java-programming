class LinkedList {

    static class Listnode {
        int val;
        Listnode next;

        Listnode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Listnode insertAtHead(Listnode head, int data) {
        Listnode newnode = new Listnode(data);
        newnode.next = head;
        return newnode;
    }

    public static Listnode insertAtTail(Listnode head, int data) {
        Listnode newnode = new Listnode(data);
        if (head == null) {
            return newnode;
        }
        Listnode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newnode;
        return head;
    }

    public static void traverse(Listnode head) {
        Listnode ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
    }
    public static void main(String[] args) {
        Listnode head = new Listnode(1);
        traverse(head);
        System.out.println("Insertion 2 at head ");
        
        head = insertAtHead(head, 2);
        traverse(head);
        System.out.println("");
        traverse(head);
        System.out.println("Insertion 3 at tail");
        head = insertAtTail(head, 3);
        traverse(head);
    }
}