
import java.util.Scanner;
public class Task4 {
    ///////// part a/////
 public    int fiboRecursion(int a,int b, int n){
        if (n<0)
            return n;
        
        else 
        System.out.println(a + " ");
       return fiboRecursion(b,a+b,n-1);
    }
  public   int fiboItreation(int a, int b , int n ){
        if (n<0)
        return n;
        for ( int i=0; i<=n; i++){
            System.out.println(a +" ");
          int   next=a+b;
                a=b;
                b=next;
        }
        return n;
    }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter number for index: ");
    int n = s.nextInt();
    ///////// part a////////////
    Task4 t= new Task4();
    System.out.println("using recursion");
    t.fiboRecursion(0,1,n);
    System.out.println("using itreation");
    t.fiboItreation(0,1,n);
    long  startTime = System.nanoTime();
   long  endTime = System.nanoTime();

    
  }  
}
