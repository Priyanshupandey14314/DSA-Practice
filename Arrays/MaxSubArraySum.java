public class MaxSubArraySum {
    public static void MaxSubArraySum(int nums[]){
        int maxSubSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end =j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(nums[k]+" ");
                    sum+=nums[k];
                }
                System.out.println();
                System.out.print("sum of this subarray is:"+sum);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {2,4,6,7,8,10,12,14};
        MaxSubArraySum(arr);
    }
}
