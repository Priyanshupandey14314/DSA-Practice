import java.util.*;
public class PermRachit {

    public class Main {

        public static void main(String[] args) {
            int[] nums = {1, 2, 3};
            List<List<Integer>> result = new ArrayList<>();
            backtrack(result, new ArrayList<>(), nums);
            System.out.println(result);
        }

        static void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums) {
            if (temp.size() == nums.length) {
                result.add(new ArrayList<>(temp));
                return;
            }

            for (int num : nums) {
                if (temp.contains(num)) continue;
                temp.add(num);
                backtrack(result, temp, nums);
                temp.remove(temp.size() - 1); // backtrack
            }
        }
    }
}
