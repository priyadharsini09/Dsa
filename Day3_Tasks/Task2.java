package Day3;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Task2 {
    static Node insertAtPosition(Node head, int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            return newNode;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position is beyond list length.");
            return head;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(8);
        head.next.next.next = new Node(10);
        head = insertAtPosition(head, 12, 3);
        printList(head);
    }
}

