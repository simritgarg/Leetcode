class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return checkPathSum(root, targetSum);
    }
    
    private boolean checkPathSum(TreeNode node, int remainingSum) {
        if (node == null) {
            return false;
        }
        remainingSum -= node.val;

        if (node.left == null && node.right == null) {
            return remainingSum == 0;
        }

        return checkPathSum(node.left, remainingSum) || 
               checkPathSum(node.right, remainingSum);
    }
}
