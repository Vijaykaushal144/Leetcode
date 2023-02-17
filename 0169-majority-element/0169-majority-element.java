class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        
        int a=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==a)
            {
                count++;
            }
            else
            {
                count--;
            }
             if(count<=0)
        {
            a=nums[i];
            count=1;
        }
        }
       
        return a;
    }
}