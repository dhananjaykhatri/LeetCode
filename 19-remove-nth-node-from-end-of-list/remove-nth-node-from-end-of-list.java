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
    
    private static int indicatorOfNodeToRemove;
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        indicatorOfNodeToRemove = n + 1;
        ListNode stub = new ListNode(0);
        stub.next = head;
        
        var prevNode = findPredecessorOfNodeToRemove(stub);
        
        if (prevNode != null) {
            
            prevNode.next = prevNode.next.next; 
        }
        
        return stub.next;
    }
    
    
    
    private ListNode findPredecessorOfNodeToRemove(ListNode node) {
        
        if (node == null) return null;
        
        var prevNode = findPredecessorOfNodeToRemove(node.next);
        
        if (indicatorOfNodeToRemove > 0 && --indicatorOfNodeToRemove == 0) {
            prevNode = node;
        }
        
        return prevNode;
    }
}