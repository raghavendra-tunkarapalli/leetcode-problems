class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),1,n,k);
        return res;
    }
    public static void backtrack(List<List<Integer>> res,List<Integer> sub,int ind,int n,int k){
        if(sub.size()==k){
            res.add(new ArrayList(sub));
        }
        for(int i=ind;i<=n;i++){
            sub.add(i);
            backtrack(res,sub,i+1,n,k);
            sub.remove(sub.size()-1);
        }
    }
}
