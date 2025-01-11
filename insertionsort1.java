package Sorting;

public class insertionsort1 {
  public static void swap(int []arr,int i,int j){
    int temp =arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
  public static void main(String[] args) {
    int []arr={13,2,49,82,74,9,27,4};
    int n=arr.length;
    for(int i=0;i<n;i++){
      for(int j=i;j>=i;j--){
        if(arr[j]<arr[j-1]){
          swap(arr,j,j-1);
        }
        else break;
      }
    }
    for(int ele:arr){
      System.out.println(ele);
    }
  }
  
}
