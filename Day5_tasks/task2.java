package Day5;
class ListNode {
    int data;
    ListNode next;
    ListNode(int data) {
        this.data = data;
    }
}
public class task2 {
    ListNode head = null;
    void insertAtTail(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;  
        } else {
            ListNode temp = head;
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
        ListNode temp = head;
        System.out.println("Circular Linked List:");
        do {
            System.out.println(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
    public static void main(String[] args) {
        task2 list = new task2();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.display();
    }
}
