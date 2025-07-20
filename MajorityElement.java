class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element =0;
        for(int i:nums){
            if(count==0)element=i;
            count+=(element==i)?1:-1;
        }
        return element;
    }
}
