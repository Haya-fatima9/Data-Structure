import java.util.Scanner;
class Task1{
public void  printAscending( int n){
   if(n<1)
   return ;
    else 
   printAscending(n-1);
   System.out.println(n + " ");

}
public void  printDescending( int n){
    if(n<1)
    return ;
     else 
     System.out.println(n + " ");
    printDescending(n-1);
  
 
 }
 



    public static void main(String agr[]){
    Task1 t=new Task1();
    Scanner s1= new Scanner(System.in);
    System.out.println("enter positive number");
    int n=s1.nextInt();
    System.out.println("Numbers from 1 to " + n + " in ascending order: ");
    t.printAscending(n);
    System.out.println("Numbers from 1 to " + n + " in descending order: ");
    t.printDescending(n);
    System.out.println();
    ////////// part b ////////////
   
    }

}