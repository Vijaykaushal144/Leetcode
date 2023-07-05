class Solution {
    public int longestSubarray(int[] nums) {
        int n= nums.length;
        int result=0;
        int zero=0;
        for(int i =0;i<n;i++)
        {
            if(nums[i]==0)
            {
                zero++;
                result= Math.max(result,findIndex(nums,i));
                                 }
            
            
                                 }
        if(zero==0) return n-1;
          return result;
                                 
                                 }
  public static int findIndex(int nums[],int index)
       {
           int curlength=0;
           int maxlength=0;
          for(int i=0;i<nums.length;i++)
          {
              if(i==index) continue;
              if(nums[i]==1)
              {
                  curlength++;
                  maxlength=Math.max(curlength,maxlength);
              }
              else
                  curlength=0;
          }
           
           return maxlength;
          }
                                 
}