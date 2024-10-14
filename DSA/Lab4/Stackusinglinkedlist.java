class Node{
    int data;
    Node next;
 
      public Node (int data){
        this.data=data;
        this.next=null;
    }
    

}
class Stack{
    Node head;
    int size=0;
    //////////////////////////push//////////////////////
   public void push(int data){
        Node newnode = new Node(data);
        if (head==null){
            head=newnode;
        }
        else {
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
           
        }
        size++;
    }
    ////////////////// pop////////////////////
    int pop(){
       
            if (head==null){
                System.out.println("Stack is empty");
                return 0;
        }
        else{
            
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            
                temp.next=null;
                size--;
                return 0;
                
       
        }
       
      
    }
       
    
    ///////////////////top//////////////////////////
    int  top(){
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
///////////////// isempty///////////////////
    boolean isEmpty(){
        if(head==null){
            return true;
        }
        else{ 
            return false;
        }
    }
    ///////////////////getsize/////////
    int getsize(){
return size;
    }
    /////// print list////
    void printlist(){
        Node temp=head;
        while(temp.next!= null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
        System.out.println(temp.data+" ");
    }

}

public class Stackusinglinkedlist {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.printlist();
      
        int k= s.top();
        System.out.println("The top elemrnt is  : " + k);
        System.out.println("Before pop the element size is  : " + s.getsize());
        s.pop();
        s.pop();
        s.pop();
       

        System.out.println("After pop the element size is   : " + s.getsize());
        System.out.print("After pop the elements in the linkedlist : " );
        s.printlist();
        boolean b=s.isEmpty();
        if(!s.isEmpty()){
System.out.println("stack is empty");
        }
        else {
            System.err.println("stack is not empty");
        }




        
    }
    
}
