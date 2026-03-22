//given a size n, print binary string(with 0/1) so that no consecutive ones appeared
public class BinaryString {
    public static void printBinary(int n,int lp,String res){
        if(n==0){
            System.out.println(res.toString());
            return;
        }
        //work
        printBinary(n-1,0,res+"0");
        if(lp==0){
            printBinary(n-1, lp,res+"1");
        }
    }
    public static void main(String[] args) {
        int n=5;
        printBinary(n,0,"");
    }
}
