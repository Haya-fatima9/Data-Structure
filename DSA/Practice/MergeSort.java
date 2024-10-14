 class MergeSort {
   public  int split(int [] arr , int left , int right){
    if (arr.length == 1){
        return 0;
    }
    if(left<right){
        int mid = left+right/2;
        split(arr,left,mid);
        split(arr, mid+1, right);
    }

    }
 public void IterativeMergeSort(int [] arr){
    
    int n = arr.length;
    int mid = n/2;

    for(int i=0;i<mid;i++){

    }
    for(int j=mid+1;j<n;j++){

    }


 }
  public static void main(String[] args) {
   MergeSort sort= new  MergeSort();
    int [] arr ={64,25,12,22,11};
    sort.split(arr,0,4);
    sort.IterativeMergeSort(arr);
  }
}
