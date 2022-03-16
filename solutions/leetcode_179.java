class Solution {
    public String largestNumber(int[] nums) {
        
        String st[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
            st[i]=Integer.toString(nums[i]);
        
        Arrays.sort(st,new Comparator<String>(){
            public int compare(String str1, String str2)
            {
                return -(str1+str2).compareTo(str2+str1);
            }
        });
    String ans="";
        for(String x:st)
            ans=ans+x;
        boolean flag=true;
        int x=0;
        for(int i=0;i<ans.length();i++)
        {
            if(ans.charAt(i)!='0')
            {
                x=i;
                flag=false;
                break;
            }
        }
        if(flag==false)
        return ans.substring(x);
        else
            return "0";
    }
}
