class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,new ArrayList<>(),res);
            return res;
        }
        public static void backtrack(int[] arr,int ind,List<Integer> list,List<List<Integer>> res){
            res.add(new ArrayList<>(list));
            for(int i=ind;i<arr.length;i++){
                if(i>ind && arr[i]==arr[i-1])continue;
                list.add(arr[i]);
                backtrack(arr,i+1,list,res);
                list.remove(list.size()-1);
            }
        }
}