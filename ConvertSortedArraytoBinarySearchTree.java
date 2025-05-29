/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sub(nums,0,nums.length-1);
    }
    public TreeNode sub(int[] arr,int left ,int right){
        if(left>right)return null;
        int mid = left+(right-left)/2;
        TreeNode node1 = new TreeNode(arr[mid]);
        node1.left = sub(arr,left,mid-1);
        node1.right = sub(arr,mid+1,right);
        return node1;
    }
}