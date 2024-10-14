
class Queue {  
          private int arr[]; 
          private int write;     
          private int read;   
          private int capacity;     
          private int count;

    // Constructor to initialize queue  
         Queue(int size){
        arr = new int[size]; 
        capacity = size;     
        write = 0;   
        read= 0;         
        count = 0;     

    } 
    /////////////enqueue/////////////////

void enqueue(int data){
    if(count==capacity){
        System.out.println("Queue Overflow");
        return;}
        {
        arr[write]=data;
        write=(write+1)%arr.length;
        count++;
    }
}
///////////////dequeue/////////////

void dequeue() {
    if (count == 0) {
        System.out.println("Queue Underflow");
        return;
    }
    read = (read + 1) % arr.length;
    count--;
}
/////////////print Queue//////////

void printQueue() {
    if (count == 0) {
        System.out.println("Queue is empty");
        return;
    }
    
    int i = read;
    for (int j = 0; j < count; j++) {
        System.out.print(arr[i] + " ");
        i = (i + 1) % arr.length;
    }
    System.out.println();
}
///////////////////top///////////
int top() {
    if (count == 0) {
        System.out.println("Queue is empty");
        return 0;
    }
    return arr[read];
}
/////////////size////////
int getsize(){
    return count;
}
/////////////isempty//////////
boolean isEmpty(){
    if(count==0)
        return true;
        
    else 
    return false;
}

}

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue q =new Queue(5);
      
        q.enqueue(1);   
        q.enqueue(2);    
        q.enqueue(3);  
      
        System.out.println("Front element is: " + q.top());
        q.dequeue();      
        System.out.println("Front element is: " + q.top()); 
        System.out.println("Queue size is " + q.getsize());
        q.dequeue();  
        q.dequeue(); 
        if (q.isEmpty())   
                  System.out.println("Queue Is Empty");    
             else     
                 System.out.println("Queue Is Not Empty");  
    }


    }
    

