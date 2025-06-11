package Day4;
import java.util.Scanner;

class post4{
	class Node {
	    int data;
	    Node prev;
	    Node next;
	    Node(int data) {
	        this.data = data;
	        this.prev = null;
	        this.next = null;
	    }
	}
    Node head;
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("List (forward): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.print("List (backward): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        post4 dll = new post4();
        int choice;
        do {
            System.out.println("\n--- Doubly Linked List Menu ---");
            System.out.println("1. Add node");
            System.out.println("2. Display forward");
            System.out.println("3. Display backward");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data to add: ");
                    int data = scanner.nextInt();
                    dll.add(data);
                    System.out.println(data + " added to the list.");
                    break;
                case 2:
                    dll.displayForward();
                    break;
                case 3:
                    dll.displayBackward();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
