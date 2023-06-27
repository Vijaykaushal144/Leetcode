class Solution {
    public int differenceOfSum(int[] nums) {
        int arsum=0;
        int digitsum=0;
        for(int i=0;i<nums.length;i++)
        {
            arsum+=nums[i];
           
            int n=nums[i];
            while(n>0)
            {
                 digitsum+=n%10;
                n=n/10;
            }
        }
        
        
        return Math.abs(arsum-digitsum);
        
    }
}