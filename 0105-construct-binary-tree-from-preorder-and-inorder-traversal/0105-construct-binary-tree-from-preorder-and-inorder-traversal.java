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
    Map<Integer,Integer> mp =new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
         }
         int n = inorder.length;
         return solve(preorder, inorder, 0,n-1,0,n-1);
    }
    public TreeNode solve(int[] preorder, int[] inorder, int preS, int preE, int inS, int inE){
        if(preS > preE || inS > inE) return null;
        TreeNode root = new TreeNode(preorder[preS]);

        int idx = mp.get(preorder[preS]);
        int count = idx - inS;

        root.left = solve(preorder, inorder, preS+1, preS+count, inS, idx-1);
        root.right = solve(preorder, inorder, preS+count+1, preE, idx+1, inE );
        return root;

    }
}