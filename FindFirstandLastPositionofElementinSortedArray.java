class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = search(nums,target);
        int last = search2(nums,target);
        return new int[]{first,last};
    }
    public int search(int[] arr,int ele){
        int res =-1;
        int left=0,rig=arr.length-1;
        while(left<=rig){
            int mid=left+(rig-left)/2;
            if(arr[mid]==ele){
                res=mid;
                rig=mid-1;
            }else if(ele<arr[mid]){
                rig=mid-1;
            }else{
                left=mid+1;
            }
        }
        return res;
    }
    public int search2(int[] arr,int ele){
        int res =-1;
        int left=0,high=arr.length-1;
        while(left<=high){
            int mid = left+(high-left)/2;
            if(arr[mid]==ele){
                res=mid;
                left=mid+1;
            }else if(ele<arr[mid]){
                high=mid-1;
            }else{
                left=mid+1;
            }
        }
        return res;
    }

}