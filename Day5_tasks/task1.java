package Day5;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
public class task1 {
    Node head = null;
    void add(int data) {
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
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(temp.data + " , ");
            temp = temp.next;
        } while (temp != head);
    }
    public static void main(String[] args) {
        task1 list = new task1();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.display();
    }
}
