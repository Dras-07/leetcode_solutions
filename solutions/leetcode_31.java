class Solution {
      public void rev(int i,int j,int nums[])
    {
        while(j>i)
        {
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            j--;
            i++;
        }
        return;
            
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        
        while(i>=0 && nums[i]>=nums[i+1])i--;
        
        if(i>=0)
        {
        int j=n-1;
        while(j>=i && j>=0 && nums[j]<=nums[i])
            j--;
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
        }
        rev(i+1,n-1,nums);
    }
}
