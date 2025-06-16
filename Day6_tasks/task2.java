package Day6;
import java.util.Scanner;
public class task2 {
    private int maxSize;
    private int[] stackArray;
    private int top;
    public task2(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
        } else {
            int popped = stackArray[top--];
            System.out.println("Popped: " + popped);
        }
    }
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + stackArray[top]);
        }
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        task2 stack = new task2(size);
        int choice;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
