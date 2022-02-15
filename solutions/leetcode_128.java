class Solution {
    public int longestConsecutive(int[] nums) {
        
        Arrays.sort(nums);
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        int c=1;
        
        int m=0;
        
        int prev=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-1==prev)
            {
                c++;
                prev=nums[i];
            }
            else if(nums[i]==prev)
            {
                prev=nums[i];
            }
            else
            {
                m=Math.max(m,c);
                c=1;
                prev=nums[i];
            }
            
        }
        m=Math.max(m,c);
        return m;
    }
}
