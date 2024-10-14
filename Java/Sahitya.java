package ds.linear;

public class Sahitya {
    int[] arr = null;
    int capacity = 5;
    int top = -1;

    // Default constructor
    public Sahitya() {
        this.arr = new int[capacity];
    }

    // Parameterized constructor
    public Sahitya(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    // Push method with dynamic resizing
    public void push(int data) {
        if (top == capacity - 1) {  // Check if stack is full
            // Dynamically increase the stack size
            System.out.println("Stack is full, resizing...");
            resize();
        }
        arr[++top] = data;
        System.out.println(data + " inserted into stack");
    }

    // Method to resize the stack dynamically
    private void resize() {
        capacity = capacity * 2;  // Double the capacity
        int[] newArr = new int[capacity];
        // Copy elements to the new array
        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        System.out.println("Stack capacity increased to: " + capacity);
    }

    // Main method
    public static void main(String[] args) {
        Sahitya s = new Sahitya();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(25);
        s.push(40);
        s.push(50); // Will trigger resizing
        s.push(60); // Will fit in resized stack
    }
}
