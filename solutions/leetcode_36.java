class Solution {
    
 public  boolean checkbox(int i,int j,char [][] board)
   {
       HashSet<Character> hm=new HashSet<>();
           for(int k=i;k<i+3;k++)
               for(int z=j;z<j+3;z++)
               {
                   if(board[k][z]!='.')
                   {
                       if(hm.contains(board[k][z]))
                       {
                           return false;
                       }
                       hm.add(board[k][z]);
                   }
               }
       return true;
   }
    boolean checkrow(char[][] board,int i,int j)
    {
        
         HashSet<Character> hm=new HashSet<>();
        for(int k=0;k<9;k++)
        {
             if(board[i][k]!='.')
                   {
                       if(hm.contains(board[i][k]))
                       {
                           return false;
                       }
                       hm.add(board[i][k]);
                   }
        }
        return true;
    }
    
    public boolean checkcol(char[][] board,int i,int j)
    {
          HashSet<Character> hm=new HashSet<>();
        for(int k=0;k<9;k++)
        {
            if(board[k][j]!='.')
                   {
                       if(hm.contains(board[k][j]))
                       {
                           return false;
                       }
                       hm.add(board[k][j]);
                   }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        boolean g=checkcol(board,6,0);
        boolean h=checkrow(board,6,0);
        //boolean f=checkbox(board,2,0);
        //System.out.println(g+" "+h+" "+f);
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
            {
                boolean a=checkcol(board,i,j);
                boolean b=checkrow(board,i,j);
               

                System.out.println(i+" "+j);
                if(a==false || b==false)
                    return false;
            }
        if(checkbox(0,0,board)==false || checkbox(0,3,board)==false || checkbox(0,6,board)==false || checkbox(3,0,board)==false || checkbox(3,3,board)==false || checkbox(3,6,board)==false || checkbox(6,0,board)==false ||checkbox(6,3,board)==false || checkbox(6,6,board)==false)
            return false;
        return true;
        
    }
}
