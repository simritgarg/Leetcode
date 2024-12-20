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
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     List<Integer> result = new ArrayList<>();
    //     func(root,result);
    //     return result;
    // }
    // private void func(TreeNode root, List<Integer> result){
    //     if(root != null){
    //         func(root.left,result);
    //         func(root.right,result);
    //         result.add(root.val);
    //     }
    // }
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null) return result;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        result.add(root.val);
        return result;


        
    }
    
}