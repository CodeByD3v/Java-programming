public class LinkedListStack {
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

    // Push: Add element to top of stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop: Remove and return the top element
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display stack elements
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;
        System.out.print("Stack (top to bottom): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        stack.display();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());

        stack.display();
    }
}
