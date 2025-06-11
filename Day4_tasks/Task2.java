package Day4;
public class Task2 {
    class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    class DoublyLinkedList {
        Node head;
        public void insertMiddle(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node slow = head, fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            newNode.next = slow.next;
            if (slow.next != null) {
                slow.next.prev = newNode;
            }
            slow.next = newNode;
            newNode.prev = slow;
        }
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Task2 task = new Task2(); 
        DoublyLinkedList dll = task.new DoublyLinkedList();  
        dll.insertMiddle(10);  
        dll.insertMiddle(20); 
        dll.insertMiddle(9);  
        dll.printList();
    }
}
