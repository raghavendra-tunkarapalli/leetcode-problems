class Solution {
    public int balancedStringSplit(String s) {
        int Lcount=0,Rcount=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')Lcount++;
            else Rcount++;
            if(Lcount==Rcount)count++;
        }
        return count;
    }
}
