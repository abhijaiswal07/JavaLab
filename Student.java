import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class StackOfStudents {
    private List<Student> items;

    public StackOfStudents() {
        this.items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void push(Student student) {
        items.add(student);
    }

    public Student pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items.remove(items.size() - 1);
    }

    public Student peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items.get(items.size() - 1);
    }

    public int size() {
        return items.size();
    }

    public static void main(String[] args) {
        // Example usage:
        StackOfStudents studentStack = new StackOfStudents();

        Student student1 = new Student("John Doe", 1);
        Student student2 = new Student("Jane Doe", 2);
        Student student3 = new Student("Bob Smith", 3);

        studentStack.push(student1);
        studentStack.push(student2);
        studentStack.push(student3);

        // Pop a student record
        Student poppedStudent = studentStack.pop();
        System.out.println("Popped Student: " + poppedStudent.name + ", ID: " + poppedStudent.id);

        // Peek at the top of the stack
        Student topStudent = studentStack.peek();
        System.out.println("Top Student: " + topStudent.name + ", ID: " + topStudent.id);

        // Check the size of the stack
        int stackSize = studentStack.size();
        System.out.println("Stack Size: " + stackSize);
    }
}
