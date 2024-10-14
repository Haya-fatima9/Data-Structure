class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Queue{
    Node head;
    private  static Node write=null, read=null;
 
    ////////////////enqueue////////////////
    void enqueue(int data){
        Node newnode= new Node(data);
        if(head==null)
        head=newnode;
      
        else{
        Node temp=head;
             newnode.next=temp;
            head=newnode;
     
            }
    }
    //////////////////////dequeue/////////////
    void dequeue(){
        if(head==null){
            System.out.println("Queue id Empty");
        }
        else {
            head=head.next;
          

        }
    }

///////////////isempty//////////
boolean isEmpty(){
    if(head==null){
        return true;
    }
    else{ 
        return false;
    }
}
////////////////////printqueue//////////////////////
void printlist(){
    Node temp=head;
    while(temp.next!= null){
        System.out.println(temp.data + " ");
        temp=temp.next;
    }
    System.out.println(temp.data+" ");
}
///////////////////////top///////////
int top(){
    if (head==null){
        System.out.println("list is empty");
        return 0;
    }
    else {
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp.data;
    }
    
}
}

public class QueueUsingLinkedlist {
    public static void main(String[] args) {
         Queue q = new Queue(); 
        q.enqueue(1);   
        q.enqueue(2);   
        q.enqueue(3);    
         q.enqueue(4);  
        System.out.printf("Front element is %d\n", q.top());  

        q.dequeue();      
        q.dequeue();       
        q.dequeue();     
        q.dequeue(); 

        if (q.isEmpty()) {     
        System.out.println("Queue is empty");    } 
    else {    
         System.out.println("Queue is not empty"); 

        
    }
    
}
}
