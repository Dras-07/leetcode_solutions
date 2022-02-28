// 2 8
// 61 91
// 2 4 27 36 42 53 91 95
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         if(l1==null)
             return l2;
        if(l2==null)
            return l1;
        if(l2.val<l1.val)
        {
            ListNode t=l2;
            l2=l1;
            l1=t;
        }
        ListNode a=l1;
        while(l1!=null && l2!=null)
        {
            ListNode tmp=null;
            while(l1!=null && l1.val<=l2.val)
            {
                tmp=l1;
                l1=l1.next;
            }
            tmp.next=l2;
            
            ListNode t=l2;
            l2=l1;
            l1=t;
        }
        return a;
    }
}
