public class SelectionSort {
    public static int[] sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minind = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minind]){
                    minind=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minind];
            arr[minind] = temp;
        }
        return arr;
    }
    public static void display(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {23,43,42,12,34,5,67,86,2,12};
        sort(arr);
        display(arr);
    }
}
