class Solution {
    public int singleNumber(int[] nums) {
        int i=0,j=0;
        Arrays.sort(nums);
        for(i=0;i<nums.length-1;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    i++;
                    break;
                }
                if(j==nums.length-1)
                    return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}