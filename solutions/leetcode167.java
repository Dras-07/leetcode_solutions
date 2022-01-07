class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int n=numbers.length;
        int j=n-1;
        int ar[]=new int[2];
        while(i<j)
        {
            int sum=numbers[i]+numbers[j];
            if(sum>target)
            {
                j--;
            }
            else if(sum<target)
            {
                i++;
            }
            else
            {
                ar[0]=i+1;
                ar[1]=j+1;
                return ar;
            }
        }
        return ar;
    }
}
