class Solution {
    
    public int pairSum(ListNode head) {
        ArrayList<Integer> lst=new ArrayList<>();
        while(head!=null)
        {
            lst.add(head.val);
            head=head.next;
        }
        int max=0;
        int j=lst.size()-1;
        for(int i=0;i<lst.size();i++)
        {
            int a=lst.get(i);
            int b=lst.get(j);
            max=Math.max(max,a+b);
            j--;
        }
        return max;
        
    }
}
