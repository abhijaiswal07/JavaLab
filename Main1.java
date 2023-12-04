import java.util.LinkedList;
import java.util.Scanner;

class LimitedStack<T> {
    private LinkedList<T> list = new LinkedList<>();
    private int limit;

    public LimitedStack(int limit) {
        this.limit = limit;
    }

    public void push(T item) {
        if (size() < limit) {
            list.addFirst(item);
        } else {
            System.out.println("Stack is full. Cannot push element.");
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit for the stack:");

        int limit = scanner.nextInt();
        LimitedStack<Integer> stack = new LimitedStack<>(limit);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter an integer to insert:");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    System.out.println("Stack elements: " + stack);
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}