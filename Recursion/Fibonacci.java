public class Fibonacci {
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fn = fib(n-1)+fib(n-2);
        return fn;
    }
    public static void main(String[] args) {
        int in = 25;
        System.out.println(fib(in));
    }
}
