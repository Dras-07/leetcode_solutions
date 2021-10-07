class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i:piles)
            pq.add(i);
        while(k>0 )
        {
            int a=pq.poll();
            int s=a-a/2;
            pq.add(s);
            k--;
        }
        int sum=0;
        while(pq.size()>0)
        {
            sum+=pq.poll();
        }
        return sum;
    }
}
