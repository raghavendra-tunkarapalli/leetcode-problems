class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void reverse(int[] num,int left,int right){
        while(left<right){
            int temp = num[left];
            num[left++]=num[right];
            num[right--]=temp;
        }
    }
}
