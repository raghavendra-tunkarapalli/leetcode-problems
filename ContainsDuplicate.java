class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ind : nums){
            if(!set.add(ind)){
                return true;
            }
        }
        return false;
    }
}
