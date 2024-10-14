class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void addToLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Recursive method to print the list in reverse
    public void printReverse(Node node) {
        if (node == null) {
            return; // Base case: if node is null, return
        }
        printReverse(node.next); // Recursive call to the next node
        System.out.print(node.data + " "); // Print the current node's data after the recursive call
    }

    // Public method to initiate reverse printing
    public void printReverse() {
        printReverse(head); // Start from the head
        System.out.println(); // Print a newline at the end
    }
}

public class Tak1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToLast(1);
        list.addToLast(2);
        list.addToLast(3);
        list.addToLast(4);
        list.addToLast(5);

        System.out.println("List in Reverse Order:");
        list.printReverse(); // Print the list in reverse order
    }
}
