class Solution {
    public int removeDuplicates(int[] nums) {
            // if(nums.length<3)
            // {
            //     return ;
            // }
        int st=2;
        for(int j=st;j<nums.length;j++)
        {
            if(nums[j]!=nums[st-2])
            {
                nums[st++]=nums[j];
            }
        }
        return st;
    }
}