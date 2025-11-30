public class PrintIncreasingNum {
    private static void printInc(int n){
        if(n==1){
           System.out.print(1+" ");
           return; 
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int a=10;
        printInc(a);
    }
}