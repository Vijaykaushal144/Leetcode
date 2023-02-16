class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int end=nums.length-1;
        int count=0;
        while(i<end)
        {
            if(nums[i]+nums[end]==k) 
            {count++;
             i++;end--;
            }
            else if(nums[i]+nums[end]>k) end--;
            else i++;
        }
        return count;
    }
}