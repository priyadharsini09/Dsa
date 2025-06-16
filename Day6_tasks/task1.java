package Day6;
public class task1{
    private int maxSize;
    private int[] stackArray;
    private int top;
    public task1(int size) {
        this.maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow. Cannot pop");
            return -1; 
        }
        return stackArray[top--];
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == maxSize - 1;
    }
    public static void main(String[] args) {
        task1 myStack = new task1(5);      
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        System.out.println("Popped: " + myStack.pop()); 
        System.out.println("Top element: " + myStack.peek()); 
    }
}
