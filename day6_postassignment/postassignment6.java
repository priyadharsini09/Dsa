package Day6;
public class postassignment6 {
    private Node top;
    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public postassignment6() {
        top = null;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed to stack.");
    }
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public static void main(String[] args) {
    	postassignment6 stack = new postassignment6();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is " + stack.peek());
        System.out.println("Popped element is " + stack.pop());
        System.out.println("Popped element is " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
