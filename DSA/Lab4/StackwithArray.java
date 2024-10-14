class Stack
{
 private int arr[];
 private int numElement;
 private int capacity;

 Stack(int size)
 {
 arr = new int[size];
 capacity = size;
 numElement = -1;
 }

 public int  push(int data)
 {
    if (isFull()) {
         System.out.println("Stack full");
         return 0;
    } else {
        return arr[++numElement] = data;
    }
 }

 public int pop()
 {
    if (isFull()) {
        return arr[numElement--];
 
    } else {
        System.out.println("Stack is empty");
        return 0;
       
    }
 }

 public int top()
 {
 
    if (isFull()) {
        return arr[numElement];
      
    } else {
        System.out.println("Stack is empty");
        return 0;
       
    }
 }

 public int size()
 {
return numElement+1;

 }

 public Boolean isEmpty()
 {
    return numElement ==1;

 }

 public Boolean isFull()
{ 
    if (numElement==capacity){
        
        
    }
    return numElement == capacity - 1;
 }

}


public class StackwithArray {
    public static void main(String[] args) {
        Stack stack = new Stack(3);  
       System.out.print("Inserting" + "  ");
       System.out.println(stack.push(1));    
       System.out.print("Inserting" + "  ");
       System.out.println(stack.push(2));  
          
       System.out.print("Inserting" + "  ");
       System.out.println(stack.push(3));
     
        System.out.println("Top element is: " + stack.top());      
       
            
        System.out.println("Stack size is " + stack.size());   
       
        System.out.print("Removing" + "  ");
        System.out.println(stack.pop());
        if (stack.isEmpty())           
          System.out.println("Stack Is Empty");         

        else            
         System.out.println("Stack Is Not Empty");     

          
}
}

