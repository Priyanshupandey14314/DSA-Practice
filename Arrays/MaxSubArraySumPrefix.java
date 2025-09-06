public class MaxSubArraySumPrefix {
    public static void main(String[] args) {
        int currSum=0;
        int nums[] = {-2,4,5,-8,6,3};
        int maxSum = Integer.MIN_VALUE;
        // Defining a prefix array to store prefix sum
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int start =i;
            for(int j=i;j<nums.length;j++){
                int end =j;
                currSum = start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum<currSum)
                maxSum=currSum;
            }
            
        }
        System.out.println(maxSum);
    }
}
