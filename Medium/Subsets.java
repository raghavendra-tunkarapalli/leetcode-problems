import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        backtrack(nums,0,new ArrayList<>(),res);
        return res;
    }
    public static void backtrack(int[] nums,int ind,List<Integer> cur,List<List<Integer>> res){
        res.add(new ArrayList(cur));
        for(int i=ind;i<nums.length;i++){
            cur.add(nums[i]);
            backtrack(nums,i+1,cur,res);
            cur.remove(cur.size()-1);
        }
    }
}