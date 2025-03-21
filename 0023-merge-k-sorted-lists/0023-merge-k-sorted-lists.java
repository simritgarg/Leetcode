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
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // priority queue (PQ) return the maximum and the min value so we dont have the to track the 
        // different arrays with the different pointer u will just get the min ele through PQ

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->{
            return a.val-b.val;
        }); // we have sort it acording to the value
        for(ListNode x: lists){
            if(x!=null){
                pq.add(x);
            }
        }

        // create the dummy node
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(!pq.isEmpty()){
            ListNode rm = pq.poll();
            curr.next = rm;
            curr = curr.next;

            // check whether the node we remove is next node null
            if(rm.next != null){
                pq.add(rm.next);
            }
        }
        return dummy.next;

    }
}