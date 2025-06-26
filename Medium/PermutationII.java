class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,new ArrayList<>(),res,new boolean[nums.length]);
        return res;
    }
    public static void backtrack(int[] arr,List<Integer> sub,List<List<Integer>> res,boolean[] bool){
        if(sub.size()==arr.length){
            res.add(new ArrayList<>(sub));
            return;
        } 
        for(int i=0;i<arr.length;i++){
            if(bool[i])continue;
            if(i>0 && arr[i]==arr[i-1] && !bool[i-1])continue;
            bool[i]=true;
            sub.add(arr[i]);
            backtrack(arr,sub,res,bool);
            bool[i]=false;
            sub.remove(sub.size()-1);
        }
    }
}
