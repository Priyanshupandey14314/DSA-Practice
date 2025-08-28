// Array is a collection of items stored at contiguous memory locations.
// It is a data structure that can hold a fixed number of values of a single type.
// Each item in an array is called an element, and each element is identified by an index.
// Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
class ArraysBasics {
    public static void main(String[] args) {
        // Declaration and Initialization of an array
        int[] numbers = new int[5]; // Declare an array of integers with a size of 5

        // Assigning values to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing and printing array elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Example of using an array to store multiple values
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        System.out.println("\nFruits in the array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}