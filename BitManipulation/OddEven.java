public class OddEven {
    public static void checkOddEven(int n){
        int bitmask = 1;
        if((n&bitmask)==0) System.out.println("Even");
        else System.out.println("Odd");
    }
    public static void main(String[] args) {
        int a = 28628733;
        checkOddEven(a);
    }
}