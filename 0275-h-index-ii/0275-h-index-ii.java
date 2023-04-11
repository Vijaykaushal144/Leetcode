class Solution {
    public int hIndex(int[] citations) {
        
         int n=citations.length;
        // for( int i=0;i<n;i++)
        // {
        //     if(n-i<=citations[i])
        //     {
        //         return n-i;
        //     }
        // }
        // return 0;
        
        //implement binary search
        
        int st=0;
        int ans=0;
        int end=citations.length;
        while(st<end)
        {
            int mid=st+(end-st)/2;
         if((n-mid)<=citations[mid])
            {
                ans=Math.max(n-mid,ans);
                     end=mid;
            }
            
            else
                st=mid+1;
        }
        
        
        return ans;
    }
}