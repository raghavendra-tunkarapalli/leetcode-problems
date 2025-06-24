class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            if(set.contains(n))return false;
            set.add(n);
            int sum =0;
            int temp = n;
            while(temp>0){
                int div = temp % 10;
                sum = sum + div * div;
                temp /= 10;
            }
            n = sum;
        }
        return true;
    }
}
