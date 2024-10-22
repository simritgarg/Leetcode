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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = true;
        int prev = 0;
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {
            TreeNode current = q.poll();
            if (current != null) {
                if (current.left != null)
                    q.offer(current.left);
                if (current.right != null)
                    q.offer(current.right);
                if (flag) {
                    if (!(current.val % 2 != 0 && current.val > prev))
                        return false;
                } else {
                    if (!(current.val % 2 == 0 && current.val < prev))
                        return false;
                }
                prev = current.val;
            } else {
                prev = flag ? Integer.MAX_VALUE : 0;
                flag = !flag;
                if (!q.isEmpty())
                    q.offer(null);
            }
        }
        return true;
    }
}