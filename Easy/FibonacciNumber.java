class Solution {
    public int fib(int n) {
        int first=0,second=1;
        for(int i=0;i<n;i++){
            int temp = first+second;
            first = second;
            second = temp;
        }
        return first;
    }
}
