
    
    class Node {
        String name;
        Node next;
        
        Node(String name) {
            this.name = name;
            this.next = null;
        }
    }
    
    class SinglyLinkedList{
        Node head;
        Node tail;
        
        // Insert at beginning
        public void insertAtBeginning(String name) {
            Node newNode = new Node(name);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = head;
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
                tail = newNode;
            }
        }
        
        // Remove from beginning
        public void removeFromBeginning() {
            if (head != null) {
                head = head.next;
                if (head == null) {
                    tail = null;
                }
            }
        }
        
        // Remove from end
        public void removeFromEnd() {
            if (head == null) return;
            if (head.next == null) {
                head = null;
                tail = null;
                return;
            }
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
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
    public class SingleLLwithTail {  
        public static void main(String[] args) {
            SinglyLinkedList sl= new  SinglyLinkedList();
            sl.insertAtBeginning("hello");
            sl.insertAtEnd("world");
            sl.insertAtBeginning("hey");
            sl.insertAtEnd("girl");
        sl.removeFromBeginning();
          sl. removeFromEnd();
           sl.printlist();
            
        }
    
}
