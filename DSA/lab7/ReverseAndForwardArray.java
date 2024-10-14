public class Task2 {
    public void reverseArray(char [] arr, int index){
    
        if (index<0)
        return;
        System.out.println(arr[index]+  " ");
        reverseArray(arr,index-1);
        
      }
      public void forwardArray(char [] arr, int index){
         
         if (index<0)
         return;
         
         forwardArray(arr,index-1);
         System.out.println(arr[index]+  " ");
         
       }

    public static void main(String[] args) {
        Task2 t=new Task2();
        char  arr[]={'a','e','i','o','u'};
        System.out.println("ReverseArray elements : ");
        t.reverseArray(arr, arr.length-1);
        System.out.println("ForwardArray elements : ");
        t.forwardArray(arr, arr.length-1);
    }
}
