class LargestSmallest{
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element in the array is: " + smallest);
        return largest;
        
    }
    public static void main(String[] args) {
        int arr[] = {15,45,78,47,14,25,14,36,45};
        System.out.println("Largest element in the array is: " + getLargest(arr));
    }
}