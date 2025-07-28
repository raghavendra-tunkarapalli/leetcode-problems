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
    static int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter=0;
        depth(root);
        return diameter;
    }
    public static int depth(TreeNode node){
        if(node==null)return 0;
        int left=depth(node.left);
        int right=depth(node.right);
        diameter = Math.max(diameter, left+right);
        return Math.max(left,right)+1;
    }
}
