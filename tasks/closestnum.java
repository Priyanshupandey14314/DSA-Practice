class closestnum{
    public static int findClosest(int[] arr, int k) {
        int newarr[] = new int[arr.length];
        int first = 0;
        int second =0;
        for(int i=0;i<arr.length;i++){
            newarr[i] = Math.abs(arr[i]-1);
            System.out.print(newarr[i]+" ");
        }
        for(int i=0;i<newarr.length;i++){
            
        }
        // for(int i=0;i<newarr.length;i++){
        //     if(newarr[i]>newarr[i]+1 || newarr[i]<newarr[i]-1){
        //         return Math.min(newarr[i+1],newarr[newarr[i-1]])
        //     }
        // }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,8,9};
        findClosest(arr, 4);
    }
}