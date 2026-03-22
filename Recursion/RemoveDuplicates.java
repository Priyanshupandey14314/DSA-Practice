public class RemoveDuplicates {
    public static String removeDuplicates(String s,int idx,StringBuilder sb,boolean map[]){
        if(idx==s.length()){
            return sb.toString();
        }
        // Actual work
        char curr = s.charAt(idx);
        if(map[curr-'a']==true){
            removeDuplicates(s, idx+1, sb, map);
        }
        else{
            map[curr-'a']=true;
            removeDuplicates(s, idx+1, sb.append(curr), map);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "appnacollege";
        StringBuilder sb = new StringBuilder();
        boolean[] map = new boolean[26];
        System.out.println(removeDuplicates(s, 0, sb, map));
    }
}
