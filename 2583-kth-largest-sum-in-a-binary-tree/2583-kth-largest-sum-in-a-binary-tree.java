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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return 0;
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            long sum = 0;
            
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode = q.poll();
                sum +=currentNode.val;
                if(currentNode.left!=null){
                    q.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    q.add(currentNode.right);
                }
            }
            minHeap.offer(sum);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        if(k>minHeap.size()){
            return -1;
        }
        return minHeap.peek();

        

    }
}