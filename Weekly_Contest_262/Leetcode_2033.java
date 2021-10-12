class Solution {
   public int getMedian(ArrayList<Integer> sets){
    Collections.sort(sets);

    return sets.get((sets.size()-1)/2);
}
    public int minOperations(int[][] grid, int x) {
        int c=0;
       // int med=0;
        int n=grid.length;
        int m=grid[0].length;
        if(n==1 && m==1)
        {
            return 0;
        }
        ArrayList<Integer> lst=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
            {
                lst.add(grid[i][j]);
               
            }
        if(lst.size()==1)
        {
            if(lst.get(0)%x!=0)
                return -1;
            else return 0;
        }
        Collections.sort(lst);
       int c1=0;
        //double med=getMedian(lst);
        int med=getMedian(lst);
         System.out.println(med);
         for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
            {
                int val=Math.abs(med-grid[i][j]);
                
                if(val!=0)
                {
                    c=c+val/x;
                    if(val%x!=0)
                        return -1;
                }
            
            }
        return c;
        
    }
}
