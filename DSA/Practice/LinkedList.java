public class LinkedList implements List {
    private Node head; // Dummy node
    private int size;  // Number of elements in the list

    // Inner class Node
    private class Node {
        Object data;  // Data stored in the node
        Node next;    // Pointer to the next node

        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor to initialize the linked list
    public LinkedList() {
        head = new Node(null); // Dummy head node
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object item) {
        Node newNode = new Node(item);
        Node current = head; // Start at the dummy node

        // Traverse to the end of the list
        while (current.next != null) {
            current = current.next;
        }

        // Add the new node at the end
        current.next = newNode;
        size++;
    }

    @Override
    public void add(int index, Object item) {
        if (index < 1 || index > size + 1) {
            System.out.println("Index out of bounds.");
            return;
        }

        Node newNode = new Node(item);
        Node current = head; // Start at the dummy node

        // Traverse to the node before the insertion point
        for (int i = 1; i < index; i++) {
            current = current.next;
        }

        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 1 || index > size) {
            System.out.println("Index out of bounds.");
            return;
        }

        Node current = head; // Start at the dummy node

        // Traverse to the node before the one to remove
        for (int i = 1; i < index; i++) {
            current = current.next;
        }

        // Remove the node
        current.next = current.next.next;
        size--;
    }

    @Override
    public void remove(Object item) {
        Node current = head; // Start at the dummy node

        // Find the node to remove
        while (current.next != null) {
            if (current.next.data.equals(item)) {
                // Remove the node
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    @Override
    public List duplicate() {
        LinkedList newList = new LinkedList();
        Node current = head.next; // Start with the first real node

        // Copy nodes to the new list
        while (current != null) {
            newList.add(current.data);
            current = current.next;
        }

        return newList;
    }

    @Override
    public List duplicateReversed() {
        LinkedList newList = new LinkedList();
        Node current = head.next; // Start with the first real node
        java.util.Stack<Object> stack = new java.util.Stack<>();

        // Push all elements onto a stack
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        // Pop all elements from the stack to create a reversed list
        while (!stack.isEmpty()) {
            newList.add(stack.pop());
        }

        return newList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ size: ").append(size).append(" - ");
        Node current = head.next; // Start with the first real node

        // Append all elements to the string builder
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }

        sb.append(" ]");
        return sb.toString();
    }

    // Main method to test the LinkedList class
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");

        System.out.println("Original List: " + list);
        System.out.println("Size: " + list.size());

        list.add(2, "Item4");
        System.out.println("After adding 'Item4' at index 2: " + list);

        list.remove(3);
        System.out.println("After removing item at index 3: " + list);

        list.remove("Item2");
        System.out.println("After removing 'Item2': " + list);

        List duplicateList = list.duplicate();
        System.out.println("Duplicate List: " + duplicateList);

        List reversedList = list.duplicateReversed();
        System.out.println("Reversed Duplicate List: " + reversedList);
    }
}
