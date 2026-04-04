public class FindPermutations {
    public static void makePerm(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String temp = str.substring(0,i)+str.substring(i+1);
            makePerm(temp, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abcde";
        makePerm(str, "");
    }
}
