class Node {
    int data;
    Node next;
    Node prev;
 Node(int data ){
    this.data=data;
    this.next=null;
    this.prev=null;
 }
}
class LinkedList{

    Node head;
    Node tail;
  
    void addtolast(int data){
        Node newnode= new Node(data);
        Node temp = head;
        if (head==null){
        head=newnode;
        tail=newnode;
        }
        else{

     
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
        }
    }
            void  addtofirst(int data)
            {

                Node newnode= new Node(data);
                    newnode.next=head;
                    head.prev=newnode;
                    head=newnode;
                
            }
            void removefirst(){
                head=head.next;
            }
            void removelast(){
              tail=tail.prev;
              tail.next=null;
            }

    
    void printlist(){
        Node temp=head;
        while(temp.next!= null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
        System.out.println(temp.data+" ");
    }
}
public class DD {
    public static void main (String args[]){
        LinkedList li =new LinkedList();
               
        li.addtolast(1);
        li.addtolast(2);
        li.addtofirst(23); 
        li.addtofirst(87);
        li.removefirst();
        li.removelast();
        li.printlist();
      
    
}
}
