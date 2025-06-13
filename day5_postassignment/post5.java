package Day5;
import java.util.Scanner;
public class post5 {
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
    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
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
        System.out.println("Head node deleted.");
    }
    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (position == 1) {
            deleteAtHead();
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
        System.out.println("Node at position " + position + " deleted.");
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
        post5 list = new post5();
        Scanner sc = new Scanner(System.in);
        int choice, data, pos;
        do {
            System.out.println("\n--- Circular Linked List Menu ---");
            System.out.println("1. Insert at Tail");
            System.out.println("2. Delete at Head");
            System.out.println("3. Delete at Position");
            System.out.println("4. Display List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter data to insert: ");
                    data = sc.nextInt();
                    list.insertAtTail(data);
                    System.out.println(data + " inserted at tail.");
                    break;
                case 2:
                    list.deleteAtHead();
                    break;
                case 3:
                    System.out.println("Enter position to delete: ");
                    pos = sc.nextInt();
                    list.deleteAtPosition(pos);
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting... Bye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}
