/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int last = n;
        while(left<last){
            int mid = left+(last-left)/2;
            if(isBadVersion(mid))last = mid;
            else left = mid+1;
        }
        return left;
    }
}
