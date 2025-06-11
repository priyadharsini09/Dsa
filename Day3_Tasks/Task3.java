package Day3;
public class Task3 {
    static Node deleteAtPosition(Node head, int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return null;
        }
        if (position == 1) {
            return head.next;  
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Invalid position.");
            return head;
        }
        current.next = current.next.next;
        return head;
    }
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(6);
        head.next.next = new Node(9);
        head.next.next.next = new Node(11);
        System.out.println("Original list: ");
        printList(head);
        
        int position = 3; 
        head = deleteAtPosition(head, position);
        System.out.println("After deletion: ");
        printList(head);
    }
}
