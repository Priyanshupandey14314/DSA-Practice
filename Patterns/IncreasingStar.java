public class IncreasingStar {
    public static void printStar(int n){
        if(n==4){
            starTimes(n);
            return;
        }
        starTimes(n);
        System.out.println();
        printStar(n+1);
    }
    public static void starTimes(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        printStar(1);
        
    }    
}
