package BitManipulation;
public class BitOperations {
    // Getting ith bit in binary

    public static int getIthBit(int n, int pos){
        int bitmask = (1<<pos);
        if((n & bitmask)==0){
            return 0;
        }
        else return 1;
    }
    // SetIthBit - sets bit at i to 1
    public static int setIthBit(int n, int pos){
        int bitmask = (1<<pos);
        return n|bitmask;
    }
    // Clear ith Bit
    public static int clearIthBit(int n, int pos){
        return n & ~(1<<pos);
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println("Done");
    }
}
