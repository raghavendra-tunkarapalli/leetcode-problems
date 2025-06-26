class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<3)return false;
        int temp=0;
        while(temp+1<n && arr[temp]<arr[temp+1]){
            temp++;
        }
        if(temp==n-1 || temp==0)return false;
        while(temp+1<n && arr[temp]>arr[temp+1]){
            temp++;
        }
        return temp==n-1;
    }
}
