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
    List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        rightSideViewHelper(root, 0);
        return result;
        
    }
    private void rightSideViewHelper(TreeNode node, int depth) {
        if (node == null) return; 

        
        if (depth == result.size()) {
            result.add(node.val);
        }

        rightSideViewHelper(node.right, depth + 1); 
        rightSideViewHelper(node.left, depth + 1);  
    }
}