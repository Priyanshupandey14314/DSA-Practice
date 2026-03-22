public class FriendsPairing {
    public static int Pair(int n){
        if(n==1 || n==2){
            return n;
        }
        //Single
        int fnm1 = Pair(n-1);
        //Pair
        int fnm2 =Pair(n-2);
        int pairWays = (n-1)*fnm2;
        int totalWays = fnm1+pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(Pair(n));
    }
}
