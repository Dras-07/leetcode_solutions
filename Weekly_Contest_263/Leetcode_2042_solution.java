class Solution {
    public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
    public boolean areNumbersAscending(String s) {
        String st[]=s.split(" ");
        int prev=Integer.MIN_VALUE;
        for(int i=0;i<st.length;i++)
        {
            if(isNumeric(st[i]))
            {
               int n=Integer.parseInt(st[i]);
                if(n<=prev)
                {
                    return false;
                }
                else
                {
                    prev=n;
                }
                
            }
        }
        return true;
    }
}
