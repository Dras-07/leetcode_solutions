class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
        Arrays.sort(nums,(a,b)-> (a.length()-b.length()));
        
        PriorityQueue<String> pq = new PriorityQueue<String>(new Comparator<String>() {
           public int compare(String p1, String p2) {
              if(p1.length()==p2.length())
              {
                  for(int i=0;i<p1.length();i++)
                  {
                      char ch1=p1.charAt(i);
                      char ch2=p2.charAt(i);
                      int a=Character.getNumericValue(ch1);
                      int b=Character.getNumericValue(ch2);
                      if(a>b)
                          return -1;
                      else if(b>a)
                          return 1;
                  }
                  return 0;
              }
               else
               {
                  return p2.length()-p1.length();
               }
           } 
        });

        int n=nums.length;
        for(int i=0;i<n;i++)
            pq.add(nums[i]);
        for(String i:pq)
            System.out.println(i);
        for(int i=0;i<k-1;i++)
            pq.remove();
        return pq.remove();
    }
}
