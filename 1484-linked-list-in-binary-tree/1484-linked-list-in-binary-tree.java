/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        return checkLinkedList(head, root, head);
    }
    public boolean checkLinkedList(ListNode head, TreeNode root, ListNode currhead){
        if(currhead==null){
            return true;
        } if(root==null){
            return false;
        }
        if(currhead.val==root.val){
            return checkLinkedList(head, root.left, currhead.next)|| checkLinkedList(head, root.right, currhead.next);
        }else if(head.val==root.val){
            return checkLinkedList(head.next, root.left, currhead)|| checkLinkedList(head.next, root.right, currhead);
        }else{
            return checkLinkedList(head, root.left, head)||checkLinkedList(head, root.right, head);
        }
    }
}