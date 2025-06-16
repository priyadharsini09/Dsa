package Day6;
public class task3 {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    public task3(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        size = 0;
        rear = -1;
    }
    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue.");
    }
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public static void main(String[] args) {
        task3 q = new task3(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front element: " + q.peek());
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        while (!q.isEmpty()) {
            System.out.println("Dequeued: " + q.dequeue());
        }
    }
}
