class STACK{

    static int numElement=0;
   int arr []=new int [5];
   boolean isEmpty(){
    if (numElement<arr.length)
        return true;

    else 
        return false;
   }
   void push(int data){
    if ()
    arr[numElement++]=data;
   }
   int pop(){
    return arr [--numElement];
   }
    int top(){
        return arr[numElement];
    }
}
public class Stack {
    public static void main(String[] args) {
        STACK s1 = new STACK();
        s1.push(2);
    
    }

    
}
