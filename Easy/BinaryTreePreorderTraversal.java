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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list1 = new ArrayList<>();
        preorder(root,list1);
        return list1;
    }
    public void preorder(TreeNode node,List<Integer> list){
        if(node==null)return;
            
            list.add(node.val);
            preorder(node.left,list);
            preorder(node.right,list);
    }
}
