package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={13,2,49,82,74,9,27,4};
        int n=arr.length;
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
            }
        }
            for(int ele:arr){
                System.out.print(ele+" ");
            }
            System.out.println();

    }}}
