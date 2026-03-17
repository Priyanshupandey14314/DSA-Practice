public class SmallestSubArrTarget {
    public static int MinSubArrTarget(int arr[],int target){
        //Find min size subarray whose sum>=target
        int start=0;
        int end=0;
        int n = arr.length;
        int sum=0;
        int minl = Integer.MAX_VALUE;
        while(end<n){
            sum+=arr[end];
            while(sum>target){
                minl = Math.min(minl, end-start+1);
                sum-=arr[start];
                start++;
            }
            end++;
        }
        return (minl == Integer.MAX_VALUE) ? 0 : minl;
    }
  public static void main(String[] args) {
    int arr[] = {4,5,3,6,7,5};
    int target = 12;
    int res = MinSubArrTarget(arr, target);
    System.out.println(res);

  }  
}
