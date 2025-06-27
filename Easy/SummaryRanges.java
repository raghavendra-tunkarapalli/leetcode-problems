class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int index = 0;
        int arraylength = nums.length;
        while(index<arraylength){
            int first = nums[index];
            while(index+1 < arraylength && nums[index+1]==nums[index]+1){
                index++;
            }
            int end = nums[index];
            list.add(first==end ? String.valueOf(first):first+"->"+end);
            index++;
        }
        return list;
    }
}
