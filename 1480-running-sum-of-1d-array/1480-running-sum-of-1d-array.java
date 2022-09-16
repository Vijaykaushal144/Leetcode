class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        // for ( int i =1 ; i<= n-1 ; i++){
        //     nums[i] = nums[i]+ nums[i-1];
        // }
       // if(n<0) return ;
        // return new int[]{runningSum(nums,n-1)+nums[n-1]};
        int i=1;
        while(i<=n-1)
        {
            nums[i]=nums[i]+nums[i-1];
            i++;
        }
        return nums;
    }
}