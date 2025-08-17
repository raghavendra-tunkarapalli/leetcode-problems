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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        zigzag(result,root,0);
        return result;
    }
    public static void zigzag(List<List<Integer>> result,TreeNode root,int order){
        if(root==null)return;
        if(result.size()==order){
            result.add(new ArrayList<>());
        }
        if(order%2==0) result.get(order).add(root.val);
        else result.get(order).add(0,root.val);
        zigzag(result,root.left,order+1);
        zigzag(result,root.right,order+1);
    }
}
