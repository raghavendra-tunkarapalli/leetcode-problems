class Solution {
    public int findNumbers(int[] nums) {
        int result =0;
        for(int i=0;i<nums.length;i++){
            int element = nums[i];
            int count =0;
            while(element!=0){
                int temp = element%10;
                count++;
                element/=10;
            }
            if(count%2==0)result++;
        }
        return result;
    }
}
