class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListStack {
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }

        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        stack.display(); // Should print: Stack: 15 10 5

        System.out.println("Peek: " + stack.peek()); // Should print: Peek: 15

        System.out.println("Pop: " + stack.pop()); // Should print: Pop: 15

        stack.display(); // Should print: Stack: 10 5
    }
}
