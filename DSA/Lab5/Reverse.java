class Node {
    int data;
    Node next;
 Node(int data ){
    this.data=data;
    this.next=null;
 }
}
class LinkedList{
    Node head;
   public void addtolast(int data){
     Node newnode= new Node(data);
    if (head==null){
            head = newnode; 
        }
        else{
                Node temp=head;
                while(temp.next!= null){
                    temp=temp.next;
                }
                temp.next= newnode;
            }     
    }
    void addtofirst(int data){
        Node newnode=new Node(data);
       newnode.next=head;
       head=newnode;
    }
    public  void printlist(){

        if (head  == null) { // Check for empty list
            System.out.println("LIST_EMPTY");
        }
        Node temp=head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println(" ");
    }
  
    public void reverselist(){

        if (head  == null) { // Check for empty list
            System.out.println("LIST_EMPTY");
            
        }
        LinkedList list = new LinkedList();
        Node temp=head;
        while(temp!= null){
            list.addtofirst(temp.data);
            temp=temp.next;
        }
       list.printlist();
    }

}

public class Reverse {
public static void main (String args[]){
    LinkedList li = new LinkedList();
    li.addtolast(1);
    li.addtolast(2);
    li.addtolast(3);
    li.addtolast(4);
    li.addtolast(5);
    System.out.println("Original linkedlist");
    li.printlist();
    System.out.println("Reverse linkedlist");
    li.reverselist();

}
    
}
