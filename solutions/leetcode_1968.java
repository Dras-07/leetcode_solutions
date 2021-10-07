class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int ar[]=new int[nums.length];
        int j=nums.length-1;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            ar[i]=nums[k++];
            else
                ar[i]=nums[j--];
        }
        return ar;
    }
}
