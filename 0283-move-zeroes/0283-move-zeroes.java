class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[count];
                nums[count]=nums[i];
                 nums[i]=temp;
                count++;
                
                
                //second logic
                
                //nums[count++]=nums[i];
                
                 
            }
        }
        // for(int i=count;i<nums.length;i++)
        // {
        //     nums[i]=0;
        // }
    }
}