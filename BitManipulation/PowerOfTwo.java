package BitManipulation;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if((n & (n-1))==0){
            System.out.println("Num is power of 2");
        }
        else System.out.println("Num is not a power of 2");
    }
}
