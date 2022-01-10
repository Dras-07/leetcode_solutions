class Solution {
    public void changecol(Integer x,int matrix[][])
    {
        int a=(int)x;
        for(int i=0;i<matrix.length;i++)
            matrix[i][a]=0;
        
    }
    
     public void changerow(Integer x,int matrix[][])
    {
        int a=(int)x;
        for(int i=0;i<matrix[0].length;i++)
            matrix[a][i]=0;
        
    }
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row=new HashSet<>();
           HashSet<Integer> col=new HashSet<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {    
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(Integer x:col)
            changecol(x,matrix);
        
        for(Integer y:row)
            changerow(y,matrix);
    }
}
