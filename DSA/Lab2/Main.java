
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
    int size=0;

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
            size++; 
    }
    void addtofirst(int data){
    Node newnode=new Node(data);
   newnode.next=head;
   head=newnode;
  
    size++;
    }
    void reverse() {
     
        if (head == null) {
            System.out.println("LIST_EMPTY");
            return;
        }

        Node prev = null;
        Node current = head;
        Node next = null;

        // Traverse and reverse the list
        while (current != null) {
            current.next = prev; 
            prev = current;    
            current = next;     
        }

        head = prev; 
    }
    void  removeDuplicate(){
        if(head==null){
            System.out.println("empty list ");
        }
         Node temp= head;
         while (temp!=null) {
            Node n =temp;
            while(n.next!=null){
                if(n.next.data==temp.data){
                    n.next = n.next.next;
                }
                else {
                    n=n.next;
                }

            }
            temp= temp.next;
            
         }
    }
    

     int nthElemnet(int n)

     {
        Node temp= head;
    
        int position=size-n;

        if(head==null)
        {
            return -1;
        }

    for (int i=0;i<position;i++){

        temp=temp.next;

    }
return temp.data;
     }
    int getsize(){
        return size;
    }
    void printlist(){
        Node temp=head;
        while(temp.next!= null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
        System.out.println(temp.data+" ");
    }
    void SearchElement(int value){
        Node temp=head;
        int index=0;
        while (temp !=null){
            if(temp.data==value){
                System.out.println("element found " + value + " at index "+ index);
                return;
            }
            temp=temp.next;
            index++;
        }
        System.out.println("element  not found ");
        return;

    }
    void addtomiddle(int index , int data){
        Node newnode=new Node(data);
        Node temp=head;
        for (int i=0;i<index-1;i++){
          
                temp=temp.next;
        }
        newnode.next=temp.next;
            temp.next=newnode;

    }
}

    public class Main{
        public static void main (String args[]){
            LinkedList li =new LinkedList();
                    int n =2;
            li.addtolast(1);
            li.addtolast(2);
           li.addtolast(3);
            li.addtolast(4);
         
        int k= li.nthElemnet(n);
         /// remove duplicate
         li.reverse();
         li.printlist();
           // li.removeDuplicate();
            li.SearchElement(2);
            li.printlist();

            //// size 
            System.out.println("Size of linkedlist is " + li.getsize()); 
            /// find element    
            
            //// nth number
            if (k != -1) {
                System.out.println("The " + n + "th node from the end is: " + k);
            } else {
               
                System.out.println("Invalid position or empty list.");
            }
           

           




 }   

}