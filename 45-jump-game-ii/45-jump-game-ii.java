class Solution {
    public int jump(int[] nums) {
//         int n=nums.length;
//        int dp[]=new int[n];
//         Arrays.fill(dp,Integer.MAX_VALUE);
//         dp[n-1]=0;
       
//         for(int i=n-2;i>=0;i--)
//         {
//              int min=Integer.MAX_VALUE;
//            for(int j=i+1;j<=Math.min(n-1,i+nums[i]);j++)
//                {min=Math.min(min,dp[j]);}
            
//             if(min!=Integer.MAX_VALUE) {dp[i]=min+1;}
//         }
      
//         return dp[0];
        int curReach=0;
        int curMax=0;
        int jump=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(i+nums[i]>curMax)
            {
                curMax=i+nums[i];
            }
            if(i==curReach)
            {
                jump++;
                curReach=curMax;
            }
        }
        return jump;
    }
}