public class TrappedRainWater {
    public static int TrappedWater(int height[]){
        int n = height.length;
        // calculating maxLeft Auxilary array
        int maxLeft[] = new int[n];
        maxLeft[0] = height[0];
        for(int i=1;i<n;i++){
            maxLeft[i] = Math.max(height[i],maxLeft[i-1]);
        }
        // calculating maxRight aux array
        int maxRight[] = new int[n];
        maxRight[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            maxRight[i]= Math.max(height[i],maxRight[i+1]);
        }
        // Calculating trapped rainwater
        int tw=0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            tw += waterLevel-height[i];
        }
        return tw;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        int res = TrappedWater(height);
        System.out.println(res);
    }
}
