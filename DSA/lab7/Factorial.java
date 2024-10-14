import java.util.Scanner;
public class Task5 {
    /////////// /////////////// factorial ///////////////////
    ///// using recursion 
     int factUsingRecursion(int n){
        if (n==1 || n == 0)
        return n;
       else
          return n *factUsingRecursion(n-1);

     }
          //// using itreation
    int  factUsingItreation(int n) {
          if (n==1 || n == 0)
          return 1;
          int result=1;
          for(int i = n ; i>1; i--){
          
          result  = result*i; 

          }
          return result;

          }
       
      
     
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Task5 t = new Task5();
        System.out.print("enter number to find factorial of a number : ");
        int n = s.nextInt();
        int  result =t.factUsingRecursion(n);
System.out.println("the factorial of "+ n + " is : " + result);
int  result2 =t.factUsingItreation(n);
System.out.println("the factorial of "+ n + " is : " + result2);
        
    }
}
