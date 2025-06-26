class Solution {
    public int missingNumber(int[] nums) {
        int leng = nums.length;
        int total = leng * (leng+1)/2;
        int sum=nums[0];
        for(int i=1;i<leng;i++){
            sum += nums[i];
        }
        return total-sum;
    }
}
