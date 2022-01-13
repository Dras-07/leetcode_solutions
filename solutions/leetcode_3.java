class Solution {
    public int lengthOfLongestSubstring(String st) {
        
        
        int i=0;
        int j=0;
        int max=0;
        int n=st.length();
        if(n==1)return 1;
        HashMap<Character,Integer> hm=new HashMap<>();
       while(i<n)
       {
           char ch=st.charAt(i);
           if(hm.containsKey(ch))
           {
               int a=hm.get(ch);
               int diff=(i-j);
               max=Math.max(max,diff);
               hm.clear();
                i=a+1;
               j=a+1;
           }
           else{
               hm.put(ch,i);
                 i++;
           }
       }
        int val=(n-j);
        
        return Math.max(max,val);
        
    }
}
