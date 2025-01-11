package Sorting;

public class insertionsort {
    public static void main(String[] args) {
        int []arr={13,2,49,82,74,9,27,4};
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
           for(int j=i;j>=1;j--){
               if(arr[j]<arr[j-1]){
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                   for(int ele:arr ){
                       System.out.print(ele+" ");
                   }
                   System.out.println();

               }


               else {
                   break;
               }
           }
        }
        for(int ele:arr ){
            System.out.print(ele+" ");
        }
    }

}
