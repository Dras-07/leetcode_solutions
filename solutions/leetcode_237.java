class Solution {
    public void deleteNode(ListNode node) {
        int val1=node.next.val;
        node.val=val1;
        node.next=node.next.next;
        
    }
}
