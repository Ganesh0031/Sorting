package Sorting;

public class Selectionsort2 {
  public static void swap(int []arr,int i,int j){
     int temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
  }
  public static void main(String[] args) {
    int [] arr={12,32,3,44,5,7,1,2,9,12};
    int n=arr.length;
    
    for(int i=0;i<n;i++){
      int min=Integer.MAX_VALUE;
      int idx=-1;
      for(int j=i;j<n;j++){
        if(arr[j]<min){
          min=arr[j];
          idx=j;
        }
      }
      swap(arr,i,idx);

    }
    for(int ele:arr){
      System.out.print(ele+" ");
    }
  }
  
}
