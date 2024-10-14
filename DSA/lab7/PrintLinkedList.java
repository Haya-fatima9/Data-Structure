public class LinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }
    }
        Node head;
      public int addtofirst(int data){
        Node newnode=new Node(data);
            if (head==null){
                head=newnode;
            }
            else
            {
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newnode;
            } 

         }
    }
class PrintLinkedList{
    public static void main(String[] args) {
       LinkedList l = new LinkedList();
       l.addtofirst(12); 
    }
}
    

