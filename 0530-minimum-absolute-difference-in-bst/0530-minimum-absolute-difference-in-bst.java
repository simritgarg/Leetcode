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
    public int Min;
    public TreeNode prev;
    public int getMinimumDifference(TreeNode root) {
        Min = Integer.MAX_VALUE;
        prev = null;
        Traverse(root);
        return Min;
    }
    public void Traverse(TreeNode node){
        if(node == null) return;
        Traverse(node.left);
        if(prev != null){
            Min = Math.min(Min,node.val - prev.val);
        }
        prev = node;
        Traverse(node.right);
        
    }
}