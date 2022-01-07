class Solution {
    
    public int calc(int nums[],int n,int index)
    {
           int fi=0;
        int li=0;
        
         for(int i=0;i<n;i++)
         {
             if(nums[i]==index)
                 li=i;
         }
        for( int i=n-1;i>=0;i--)
            if(nums[i]==index)
                fi=i;
        
        return Math.abs(fi-li)+1;
    }
    public int findShortestSubArray(int[] nums) {
        //Arrays.sort(nums);
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i:nums)
            hm.put(i,hm.getOrDefault(i,0)+1);
        int index=0;
        int max=0;
        for(Integer x:hm.keySet())
        {
            int val=hm.get(x);
            if(val>max)
            {
                max=val;
                index=x;
            }
        }
       int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(Integer x:hm.keySet())
        {
            if(hm.get(x)==max)
                ans=Math.min(ans,calc(nums,n,x));
        }
     return ans;
              
    }
}
