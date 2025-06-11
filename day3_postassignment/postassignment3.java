package Day3;
import java.util.Scanner;

public class postassignment3 {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class MenuDrivenSLL {
        private Node head;

        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            System.out.println(data + " inserted at the beginning.");
        }

        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                System.out.println(data + " inserted at the end.");
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            System.out.println(data + " inserted at the end.");
        }

        public void deleteFromBeginning() {
            if (head == null) {
                System.out.println("List is empty, nothing to delete.");
                return;
            }
            System.out.println(head.data + " deleted from the beginning.");
            head = head.next;
        }

        public void deleteFromEnd() {
            if (head == null) {
                System.out.println("List is empty, nothing to delete.");
                return;
            }
            if (head.next == null) {
                System.out.println(head.data + " deleted from the end.");
                head = null;
                return;
            }
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            System.out.println(current.next.data + " deleted from the end.");
            current.next = null;
        }

        public void display() {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
            System.out.print("List elements: ");
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        MenuDrivenSLL list = new MenuDrivenSLL();
        Scanner sc = new Scanner(System.in);
        int choice, data;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Delete from beginning");
            System.out.println("4. Delete from end");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at beginning: ");
                    data = sc.nextInt();
                    list.insertAtBeginning(data);
                    break;
                case 2:
                    System.out.print("Enter data to insert at end: ");
                    data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 3:
                    list.deleteFromBeginning();
                    break;
                case 4:
                    list.deleteFromEnd();
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
