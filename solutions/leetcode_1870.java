class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
    
        int n=dist.length;
        
        
        
       /* if(n==3 && dist[n-1]==100000 && dist[0]==1)
            return 100000;*/
     
        
        double count=0;
          for(int i=0;i<n-1;i++)
            {
            double a=(double)dist[i]/10000000;
                if(i==n-1)
                count+=(double)((double)dist[i]/10000000);
                else
                count=count+(Math.ceil(a));
                
            // System.out.println(op);
            }
        System.out.println(count);
        
        if(count>=hour)
            return -1;
        int right=10000000;
        int left=1;
        double op=0;
        int mid=0;
        int min=Integer.MAX_VALUE;
        while(right>left)
        {
            mid=left+(right-left)/2;
             op=0;
            for(int i=0;i<n;i++)
            {
            double a=(double)dist[i]/mid;
                if(i==n-1)
                op+=(double)((double)dist[i]/mid);
                else
                op=op+(Math.ceil(a));
                
            // System.out.println(op);
            }
        //  System.out.println(op+"p "+mid);
            if(op<=hour)
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
            
            
           
        }
        
    // 
        return right;
    }
}
