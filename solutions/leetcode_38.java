class Solution {
    
    
    public String get(String st)
    {
        String ans="";
        int n=st.length();
     
        char prev=st.charAt(0);
     //   System.out.println(prev);
        int c=1;
        for(int i=1;i<n;i++)
        {
            if(st.charAt(i)==prev)
            {
                c++;
            }
            else
            {
                ans=ans+""+c+""+prev;
              
                c=1;
                prev=st.charAt(i);
            }
        }
        ans=ans+""+c;
    ans=ans+prev;
       return ans; 
    }
    public String solve(int n,String st)
    {
        String a="1";
       for(int i=1;i<n;i++)
       {
           String x=get(a);
           a=x;
       }
        return a;
     
    }
    public String countAndSay(int n) {
        
  
       return solve(n,"1");
    
    }
}
