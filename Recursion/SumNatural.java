import java.util.Scanner;
public class SumNatural {
    public static int sum(int n){
        if(n==1){
            return 1;
        } 
        int sum = n+sum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sum(a));

    }
}
