class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
       List<List<Integer>> res = new ArrayList<>();
       backtrack(candidates,target,0,new ArrayList<>(),res);
       return res; 
    }
    public static void backtrack(int[] candidates,int target,int start,List<Integer> sub,List<List<Integer>> res){
        if(0==target){
            res.add(new ArrayList<>(sub));
        }
        for(int i=start;i<candidates.length;i++){
            if(start<i && candidates[i]==candidates[i-1])continue;
            if(candidates[i]>target)break;
            sub.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i+1,sub,res);
            sub.remove(sub.size()-1);
        }
    }
}
