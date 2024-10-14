class Node {
    String name;
    Node prev, next;
    
    Node(String name) {
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList{
    Node head;
    Node tail;
    
    // Insert at beginning
    public void insertAtBeginning(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    
    // Insert at end
    public void insertAtEnd(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    // Remove from beginning
    public void removeFromBeginning() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }
    }
    
    // Remove from end
    public void removeFromEnd() {
        if (tail != null) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }
    void printlist(){
        Node temp=head;
        while(temp.next!= null){
            System.out.println(temp.name + " ");
            temp=temp.next;
        }
        System.out.println(temp.name+" ");
    }
}

public class DoublyLLwithTail {
    public static void main(String[] args) {
        DoublyLinkedList dl = new  DoublyLinkedList();
        dl.insertAtBeginning("hello");
        dl.insertAtEnd("world");
        dl.insertAtBeginning("hey");
        dl.insertAtEnd("girl");
        dl.removeFromBeginning();
        dl.removeFromEnd();
        dl.printlist();
    }
    
}
