package Day5;
public class deleteatposition {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    Node head = null;
    void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }
    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (position == 1) {
            if (head.next == head) {
                head = null;  
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            return;
        }
        Node current = head;
        Node prev = null;
        int count = 1;
        while (count < position && current.next != head) {
            prev = current;
            current = current.next;
            count++;
        }
        if (count != position) {
            System.out.println("Position out of range.");
            return;
        }
        prev.next = current.next;
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.println(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
    public static void main(String[] args) {
        deleteatposition list = new deleteatposition();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        System.out.println("Original list:");
        list.display();
        list.deleteAtPosition(3);
        System.out.println("After deleting");
        list.display();
    }
}
