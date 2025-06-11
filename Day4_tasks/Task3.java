package Day4; 
public class Task3 {

    public static class DoublyLinkedList {
        Node head;
        int size;

        static class Node {
            int data;
            Node next, prev;
            Node(int data) {
            	this.data = data;
            	}
        }
        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null)
            	head = newNode;
            else {
                Node temp = head;
                while (temp.next != null) temp = temp.next;
                temp.next = newNode;
                newNode.prev = temp;
            }
            size++;
        }
        public void deleteMiddleNode() {
            if (head == null || size == 1)
            	return;
            Node middle = head;
            for (int i = 0; i < size / 2; i++) 
            	middle = middle.next;
            if (middle.prev != null)
            	middle.prev.next = middle.next;
            if (middle.next != null) 
            	middle.next.prev = middle.prev;
            size--;
        }
        public void printList() {
            for (Node temp = head; temp != null; temp = temp.next) 
            	System.out.print(temp.data + " ");
            System.out.println();
        }
        public static void main(String[] args) {
            Task3.DoublyLinkedList list = new Task3.DoublyLinkedList();
            list.append(1);
            list.append(2);
            list.append(3);
            list.append(4);
            list.append(5);
            list.printList();
            list.deleteMiddleNode();
            list.printList();
        }
    }
}
