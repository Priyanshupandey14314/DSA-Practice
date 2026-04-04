public class FindSubsets {
    public static void makeSubset(String str,String ans, int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes
        makeSubset(str,ans+str.charAt(i),i+1);
        //No
        makeSubset(str, ans, i+1);
    }
    public static void main(String[] args){
        String str = "abc";
        makeSubset(str,"",0);
    }
}
