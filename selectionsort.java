package Sorting;

public class selectionsort {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int []arr={13,2,49,82,74,9,27,4};
       int n=arr.length;
       for(int i=0;i<n-1;i++){
           int min=Integer.MAX_VALUE;
           int idx=-1;
           for(int j=i;j<n;j++){
               if(arr[j]<min){
                   min=arr[j];
                   idx=j;
               }

           }
           swap(arr,idx,i);

       }
       for(int ele:arr){
           System.out.print(ele+" ");
       }

    }
}
