public class PassingArrayToFunc {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
    public static void modifyArray(int arr[],int nonChangeable) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 2; // Increment each element by 5
            nonChangeable = nonChangeable+5;
        }
    }
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50};
        int nonChangeable = 5;
        System.out.println("Array elements before modification:");
        printArray(nums);
        modifyArray(nums,nonChangeable);
        System.out.println("Array elements after modification:");
        printArray(nums);
        System.out.println("Nonchangable is :"+nonChangeable);
    }
}
