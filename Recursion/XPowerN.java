import java.util.Scanner;
public class XPowerN{
    public static int optimizedPower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPowSquare = (optimizedPower(a,n/2)) * (optimizedPower(a, n/2));
        if(n%2!=0){
            halfPowSquare = a*halfPowSquare;
        }
        return halfPowSquare;
    }
    public static int power(int a,int n){
        if(n==0){
            return 1;
        }
        // int npm1 = a*power(a, n-1);
        // int np = a*npm1;
        // return np;
        return a*power(a, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        // sc.next();
        System.err.println("Enter value of power: ");
        int n = sc.nextInt();
        System.out.println("Result: "+optimizedPower(a, n));
        System.out.println(power(a, n));
    }
}