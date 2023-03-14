class Solution {
    public int[] sortedSquares(int[] nums) {
        int n[]= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            
            n[i]=Math.abs(nums[i]*nums[i]);
        }
        Arrays.sort(n);
        return n;
    }
}