class  linkedlist{
     private Node head;
    private int size;

    class Node{
        Object data;
        Node next;
        Node(Object data ){
            this.data=data;
            this.next=null;
        }
    }
    public linkedlist(){
        Node head = new Node(null); // Dummy node
        int size = 0;

    }

    /// empty method
    public boolean isEmpty(){
        return size==0;
    }  
    /////// size method 
    int size(){
            return size;
    }
    public void addtolast(Object item) {
        Node newNode = new Node(item);
        Node current = head;

        // Traverse to the end of the list
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        size++;
    }

}



public class Main2 {
    public static void main(String[] args) {
        linkedlist li =new linkedlist();
        System.out.println("Size of linkedlist is " + li.size());
    }
    
}
