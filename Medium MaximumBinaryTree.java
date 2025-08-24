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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return balance(nums,0,nums.length-1);
    }
    public static TreeNode balance(int[] nums,int start,int end){
        if(start>end)return null;
        int maxIndex = start;
        for(int i=start;i<=end;i++){
            if(nums[maxIndex]<nums[i])maxIndex=i;
        } 
        TreeNode tree = new TreeNode(nums[maxIndex]);
        tree.left=balance(nums,start,maxIndex-1);
        tree.right=balance(nums,maxIndex+1,end);
        return tree;
    }
}
