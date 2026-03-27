public class MergerSort {
    
    public static void MergeSort(int[] arr,int start,int end){
        //Base Case
        if(start>=end){
            return;
        }
        //Divide
        int mid = start+(end-start)/2;
        MergeSort(arr, start, mid);
        MergeSort(arr, mid+1, end);
        Merge(arr,start,end, mid);
    }
    public static void Merge(int[] arr,int s,int e,int mid){
        int[] temp = new int[e-s+1];
        int i=s;
        int j = mid+1;
        int k=0;
        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //remaining left
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //remaining right
        while(j<=e){
            temp[k++] = arr[j++];
        }
        //Copying temp to original array
        for(k=0,i=s;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,1,8,7,2,3,9,5,6,8,1,0};
        MergeSort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
