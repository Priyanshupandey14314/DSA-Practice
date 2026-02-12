public class FirstOccurence {
    public static int firstOccur(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[] = {12,47,2,45,4,8,2,5,2};
        System.out.println(firstOccur(arr, 2, 0));
    }
}
