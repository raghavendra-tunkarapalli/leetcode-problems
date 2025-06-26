class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums,res,new ArrayList<>(),new boolean[nums.length]);
        return res;
    }
    public static void backtrack(int[] arr,List<List<Integer>> res,List<Integer> sub,boolean[] bool){
        if(sub.size()==arr.length){
            res.add(new ArrayList(sub));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(bool[i])continue;
            bool[i]=true;
            sub.add(arr[i]);
            backtrack(arr,res,sub,bool);
            sub.remove(sub.size()-1);
            bool[i]=false;
        }
    }
}
