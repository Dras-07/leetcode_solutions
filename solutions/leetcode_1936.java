class Solution {
    public int addRungs(int[] rungs, int dist) {
        int count=0;
        int prev=0;
        
        for(int i=0;i<rungs.length;i++)
        {
            if(rungs[i]-prev>dist)
            {
                count+=(rungs[i]-prev-1)/dist;
            }
            prev=rungs[i];
        }
        return count;
    }
}
