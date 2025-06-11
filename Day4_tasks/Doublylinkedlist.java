package Day4;
class Doublylinkedlist {
    Node head, tail;
    static class Node {
        int data;
        Node next, prev;
        Node(int data) {
        	this.data = data;
        	}
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) { 
        	head = tail = newNode;
        	}
        else {
        	tail.next = newNode;
        	newNode.prev = tail;
        	tail = newNode;
        	}
    }
    public void traverseFrontToBack() {
        Node temp = head;
        while (temp != null) {
        	System.out.println(temp.data + " ");
        	temp = temp.next;
        	}
        System.out.println();
    }
    public void traverseBackToFront() {
        Node temp = tail;
        while (temp != null) {
        	System.out.println(temp.data + " ");
        	temp = temp.prev; 
        	}
        System.out.println();
    }
    public static void main(String[] args) {
        Doublylinkedlist list = new Doublylinkedlist();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.traverseFrontToBack();
        list.traverseBackToFront();
    }
}
