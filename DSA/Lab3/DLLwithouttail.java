 class Node {     
    String name;    
     Node prev, next;  
    Node (String name){    
             this.prev = null;   
             this.next = null;
             this.name = name;  } 
            }   
class DoubleLinkedList {  
    Node head;  
    public void insertAtBeginning(String name) {  
        Node newnode= new Node(name);
        if (head==null){
            head=newnode;
        }
        else{
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        }
    

    }
    public void insertAtBeginning(Node node){ 
        if (head==null){
            head=node;
        }
        else{
        node.next=head;
        head.prev=node;
        head=node;
        }
    

    } 
    public void insertAtEnd(String name){
        Node newnode= new Node(name);
        Node temp = head;
        if (head==null){
        head=newnode;
        }
        else{

               while(temp.next!=null){
                    temp=temp.next;
               }
               temp.next=newnode;
               newnode.prev=temp;
               temp=newnode;

    
        }

    }
    public void insertAtEnd(Node node) {
        Node temp = head;
        if (head==null){
        head=node;
        }
        else{

               while(temp.next!=null){
                    temp=temp.next;
               }
               temp.next=node;
               node.prev=temp;
               temp=node;

    
        }


    }
    public void insertAfterName(String name,Node node) {
            Node temp=head;
       
          
            while(temp.next!=null&& temp.name.equals(name)){
                temp=temp.next;
            }
            if (temp != null){
             node.next=temp.next;
            
            if (temp.next != null) {
                temp.next.prev = node;
            }
            temp.next = node;
            node.prev = temp;
        
        }
    
  

}




    
    public void insertBeforeName(String name, Node node) {
             
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head.name.equals(name)) {
            node.next = head;
            head = node;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.name.equals(name)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Node with name " + name + " not found.");
            return;
        }

        node.next = current.next;
        current.next = node;
    }
    public void makeCircular(){

            if (head == null) {
                return;
            }
        
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = head;
            head.prev = temp;
        }
        

    
        public void printAll() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.name + " ");
                temp = temp.next;
                if (temp == head) {
                    break; // To prevent infinite loop if the list is circular
                }
            }
            System.out.println();
        }
}
  

public class DLLwithouttail {
    public static void main(String[] args) {
        DoubleLinkedList dl=new DoubleLinkedList();
        dl.insertAtEnd("a");
  
        dl.insertAtEnd("b");
      
            Node n= new Node("c");
            dl.insertAtBeginning(n);
            dl.insertAtEnd("d");
           Node n1= new Node("e");
            dl.insertAtEnd(n1);

            Node n2= new Node("0000");
            dl.insertAfterName("a",n2);

            Node newNode= new Node("9999");
            dl.insertBeforeName("haya",newNode);
            dl.makeCircular();
            dl.printAll();
          
    }
    
}
