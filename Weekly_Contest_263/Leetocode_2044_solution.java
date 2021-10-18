class Solution {
    List<List<Integer>> subset=new ArrayList<List<Integer>> ();
   public static void findSubsets(List<List<Integer>> subset, ArrayList<Integer> nums, ArrayList<Integer> output, int index)
    {
     
        if (index == nums.size()) {
            subset.add(output);
            return;
        }
       
        
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);
 
        output.add(nums.get(index));
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);
    }
    public int countMaxOrSubsets(int[] num) {
         ArrayList<Integer> nums=new ArrayList<>();
        for(int i:num)
            nums.add(i);
        findSubsets(subset,nums,new ArrayList<>(),0);
        int max=0;
        for(int i=0;i<subset.size();i++)
        {
            int m=0;
            for(int j=0;j<subset.get(i).size();j++)
            {
                m=m|subset.get(i).get(j);
            }
            max=Math.max(m,max);
        }
        int c=0;
       
         for(int i=0;i<subset.size();i++)
        {
            int m=0;
            for(int j=0;j<subset.get(i).size();j++)
            {
                m=m|subset.get(i).get(j);
            }
           if(m==max && subset.get(i).size()!=0){
               c++;
              
           }
        }
       
        return c;
    }
}
