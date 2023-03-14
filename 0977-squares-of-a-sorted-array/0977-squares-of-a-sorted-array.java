class Solution {
    public int[] sortedSquares(int[] nums) {
//         for(int i=0;i<nums.length;i++)
//         {
            
//             nums[i]=Math.abs(nums[i]*nums[i]);
//         }
//         Arrays.sort(nums);
//         return nums;
        
        
        int st=0;
        int num[]= new int[nums.length];
        int end=nums.length-1;
        int out=nums.length-1;
        while(st<=end)
        {
            int lowop=(nums[st]*nums[st]);
            int hihop=(nums[end]*nums[end]);
            if(lowop>hihop)
            {
                num[out--]=lowop;
                st++;
            }
            else
            {
                num[out--]=hihop;
                end--;
            }
        }
        return num;
    }
}