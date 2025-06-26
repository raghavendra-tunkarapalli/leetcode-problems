class Solution {
  public int maxSubArray(int[] nums) {
    int temp = nums[0];
    int res = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (temp + nums[i] > nums[i]) {
        temp = nums[i] + temp;
      } else {
        temp = nums[i];
      }
      if (res < temp) {
        res = temp;
      }
    }
    return res;
  }
}