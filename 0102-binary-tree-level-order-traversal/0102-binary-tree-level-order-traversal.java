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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        q.offer(root);
        while(!q.isEmpty()){
            int levelsize = q.size();
            List<Integer> currentlevel = new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode currentNode = q.remove();
                currentlevel.add(currentNode.val);
                if (currentNode.left != null) q.add(currentNode.left);
                if (currentNode.right != null) q.add(currentNode.right);
                

            }
            result.add(currentlevel);
        }
        return result;
    }
}