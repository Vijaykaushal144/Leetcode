class Solution {
    public boolean stoneGame(int[] nums) {
        Arrays.sort(nums);
        int alice=0;
        int bob=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(i%2==0)
            {
                alice=alice+nums[i];
            }
            else bob=bob+nums[i];
        }
        if(alice>bob)
            return true;
        else
            return false;
        
    }
}