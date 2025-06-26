class Solution {
    public int hammingWeight(int n) {
        int res=0;
        while(n>0){
            int half = n%2;
            if(half==1)res++;
            n /= 2;
        }
        return res;
    }
}
