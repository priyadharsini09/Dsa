package Day6;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class frontandrear {
    private Node front;
    private Node rear;
    public frontandrear() {
        front = rear = null;
    }
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
            System.out.println(item + " enqueued.");
            return;
        }
        rear.next = newNode;
        rear = newNode;
        System.out.println(item + " enqueued.");
    }
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = front.data;
        front = front.next;
        if (front == null) { 
            rear = null;
        }
        return item;
    }
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return front.data;
    }
    public boolean isEmpty() {
        return front == null;
    }
    public static void main(String[] args) {
        frontandrear queue = new frontandrear();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
        queue.enqueue(20);
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}
