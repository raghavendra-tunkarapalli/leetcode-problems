class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfDivide(i)){
                result.add(i);
            }
        }
        return result;
    }
    public static boolean selfDivide(int number){
        int helper = number;
        while(helper!=0){
            int temp = helper%10;
            if(temp == 0 || number%temp!=0)return false;
            helper /= 10;
        }
        return true;
    }
}
