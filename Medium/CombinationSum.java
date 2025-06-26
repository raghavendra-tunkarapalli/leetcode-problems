class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
       backtrack(candidates,target,res,new ArrayList<>(),0);
       return res; 
    }
    public static void backtrack(int[] arr,int target,List<List<Integer>> res,List<Integer> list,int init){
        if(target==0){
            res.add(new ArrayList(list));
            return;
        }
        if(target<0)return;
        for(int i=init;i<arr.length;i++){
            list.add(arr[i]);
            backtrack(arr,target-arr[i],res,list,i);
            list.remove(list.size()-1);
        }
    }
}