class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        backtrack(nums,target,new ArrayList<>(),0,0l);
        return result;
    }
    public void backtrack(int[] arr,int target,List<Integer> sublist,int start,long sum){
        if(sublist.size()==4){
            if(sum==target){
                result.add(new ArrayList<>(sublist));
            }
            return;
        }
        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i]==arr[i-1])continue;
            sublist.add(arr[i]);
            backtrack(arr,target,sublist,i+1,sum+arr[i]);
            sublist.remove(sublist.size()-1);
        }
    }
}
