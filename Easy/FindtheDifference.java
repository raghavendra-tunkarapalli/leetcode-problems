class Solution {
    public char findTheDifference(String s, String t) {
       int sum=0;
       for(int i:t.toCharArray()){
        sum += i;
       }
       for(int i:s.toCharArray()){
        sum -= i;
       }
       return (char)sum;
    }
}
