public class BubbleSort{
    public static int[] sort(int arr[]){
        for(int pass=1;pass<arr.length;pass++){
            for(int j=0;j<(arr.length)-pass-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,1,4,2,8};
        sort(arr);
        display(arr);
        
    }
}