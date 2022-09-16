class Solution {
    public int findMiddleIndex(int[] nums) {
       int left=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            int right=sum-nums[i]-left;
            if(left==right) return i;
            
            left=left+nums[i];
        }
        return -1;
    }
}