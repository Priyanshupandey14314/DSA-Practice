public class maxSubArraySumKadden {
    public static void Kaddens(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;
        int count=0;
        int negMin = Integer.MIN_VALUE;
        for(int num:nums){
            if(num<0){
                count ++;
                negMin = Math.max(negMin,num);
            }
        }
        if(count==nums.length){
            System.out.println(negMin);
        }else{
            for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum = Math.max(maxSum,currSum);
        }
        System.out.println(maxSum);
        }
        
    }
    public static void main(String[] args) {
        // int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int arr[] = {-1,-2,-5,-6};
        Kaddens(arr);
    }
}
