
import java.util.ArrayList;
import java.util.Collections;
public class PairSum1 {
    public static boolean findPair(ArrayList<Integer> list, int target){
        //Brute force
        /*for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false; */

        //Optimized
         Collections.sort(list);
         int left = 0;
         int right = list.size()-1;
         while(left!=right){
            if(list.get(left)+list.get(right) == target){
                return  true;
            }
            else if(list.get(left)+list.get(right)<target){
                left++;
            }
            else{
                right--;
            }
         }
         return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(20);
        list.add(30);
        list.add(4);
        list.add(5);
        int target = 50;
        System.out.println(findPair(list, target));
    }
}
