class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(right=0;right<nums.length;right++)
        {
            sum+=nums[right];
           
            if(sum>=target)
            {
                while(sum>=target)
                {
                    sum-=nums[left];
                    left++;
                    
                }
                min=Math.min(min,right-left+2);
            }
            
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}