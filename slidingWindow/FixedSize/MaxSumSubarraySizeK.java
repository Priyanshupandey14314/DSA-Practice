public class MaxSumSubarraySizeK {
    public static int MaxSumSubarrayOfSizeK(int arr[],int k){
        int start=0;
        int end=k;
        int sum=0;
        for(end=0;end<k;end++){
            sum+=arr[end];
        }
        int maxSum = sum;
        while(end<arr.length){
            sum+=arr[end]-arr[start];
            start++;
            end++;
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,1,3,8,7,4};
        int k=3;
        int res = MaxSumSubarrayOfSizeK(arr, k);
        System.out.println(res);
    }
}
