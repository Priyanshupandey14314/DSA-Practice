
import java.util.Arrays;

class Knapsack {
    public static int findMaxProfit(int[] val, int[] wt, int W, int n,int[][] dp){
        if(W==0 || n==0){
            return 0;
        }
        if(dp[n-1][W-1] != -1){
            return dp[n-1][W-1];
        }
        //check if valid
        if(wt[n-1]<=W){
            //include
            int ans1 = val[n-1]+findMaxProfit(val, wt, W-wt[n-1], n-1,dp);
            //exclude
            int ans2 = findMaxProfit(val, wt, W, n-1,dp);
            int res = Math.max(ans1,ans2);
            return dp[n][W] = res;
        }
        else{
            //exclude
            dp[n][W] = findMaxProfit(val, wt, W, n-1,dp);
            return dp[n][W];
        }

    }
    public static void main(String[] args) {
        int n = 5;
        int[] val = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        int[][] dp = new int[n+1][W+1];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }
        int res = findMaxProfit(val, wt, W,5,dp);
        System.out.println(res);

    }
}
