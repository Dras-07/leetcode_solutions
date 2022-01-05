public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        
        int low=1;
        int ans=1;
        int high=n;
        while(high>=low)
        {
            int mid=low+(high-low)/2;
            if(isBadVersion(mid))
            {
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
       
        return ans;
    }
}
