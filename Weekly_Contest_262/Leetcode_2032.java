class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> hm1=new HashSet<>();
         HashSet<Integer> hm2=new HashSet<>();
         HashSet<Integer> hm3=new HashSet<>();
        for(int i:nums1)
            hm1.add(i);
          for(int i:nums2)
            hm2.add(i);
          for(int i:nums3)
            hm3.add(i);
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<=100;i++)
        {
            int c=0;
            if(hm1.contains(i))
                c++;
             if(hm2.contains(i))
                c++;
             if(hm3.contains(i))
                c++;
            
            if(c>=2)
                lst.add(i);
        }
        return lst;
        
    }
}
