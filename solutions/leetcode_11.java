
class Solution {
    public int maxArea(int[] height) {
        
        int high=height.length-1;
        int low=0;
        int ans=0;
        while(high>low)
        {
            int diff=high-low;
            int h=Math.min(height[high],height[low]);
            int val=h*diff;
            ans=Math.max(val,ans);
            if(height[low]<height[high])
                low++;
            else
                high--;
        }
        return ans;
    }
}


