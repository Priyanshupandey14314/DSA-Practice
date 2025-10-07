public class MaxSubArraySumBF {
    // BruteForce approach to print max subarray sum
    public static int maxSubArraySum(int nums[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int start =0;
            for(int j=i;j<nums.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum+=nums[k];
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
                System.out.println("CurrSum is: "+currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-28,-7,-25,-25,-19,-9,-9,-2,-20,-27};
        int res = maxSubArraySum(arr);
        System.out.println("Max Subarray sum is :"+res);

    }
}
