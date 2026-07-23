public class PrefixArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int preArr[] = new int[n];
        preArr[0] = arr[0];
        for(int i=1;i<n;i++){
            preArr[i] = preArr[i-1]+arr[i];
        }
        for(int i=0;i<preArr.length;i++){
            System.out.print(preArr[i]+" ");
        }

    }
}
