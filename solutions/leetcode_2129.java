class Solution {
    public String capitalizeTitle(String title) {
       String[] st = title.split(" ");
        int n=st.length;
        for(int i=0;i<n;i++)
        {
            if(st[i].length()>2)
            {
               String fin= st[i].toLowerCase();
                char x=st[i].charAt(0);
                char a=Character.toUpperCase(x);  

                String change=fin.substring(1,st[i].length());
                st[i]=a+change;
            }
            else
            {
                String fin=st[i].toLowerCase();
                st[i]=fin;
            }
        }
        String v="";
        for(int i=0;i<n;i++)
        {
            System.out.println(st[i]);
            v+=st[i]+" ";
        }
        return v.substring(0,v.length()-1);
        
    }
}
