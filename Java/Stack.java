public class Stack {
    int[] arr = null;
    int capacity = 5;
    int top = -1;

    // Default constructor
    public Stack() {
        this.arr = new int[capacity];
    }

    // Parameterized constructor
    public Stack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    // Push method
    public void push(int data) {
        if (top == capacity - 1) {
            System.err.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
        System.out.println(data + " inserted into stack");
    }

    // Pop method (tail-recursive implementation)
    public int pop() {
        if (top == -1) {
            System.err.println("Stack Underflow");
            return -1;
        }

        int data = arr[top];
        top--;
        return data;
    }

    // Main method
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(25);
        s.push(40);
        s.push(50); // This will trigger a stack overflow error

        System.out.println("Popped elements:");
        while (s.top != -1) {
            int popped = s.pop();
            System.out.println(popped);
        }
    }
}