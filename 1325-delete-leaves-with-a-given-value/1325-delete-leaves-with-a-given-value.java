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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) return null;
        root.left = removeLeafNodes(root.left,target);
        root.right = removeLeafNodes(root.right,target);
        if(root.val == target && root.left == null && root.right == null){
                return null;
        }
        return root;
        // Queue<Integer> q = new LinkedList<>();
        // q.offer(root);
        // while(!q.isEmpty()){
        //     int s = q.size();
        //     for(int i=0;i<s;i++){
        //         ArrayList<Integer> l = new ArrayList<>();
        //         int curr = q.poll();
        //         l.append(curr);
        //     }
        //     if( (root.val == target && root.left == null && root.right == null)}
        //         +
        //     }
        //     else if(root.left != null){
        //         q.offer(root.left);
        //     }
        //     else q.offer(root.right);
            
        // }
    }
}