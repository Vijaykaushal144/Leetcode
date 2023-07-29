class Solution {
    public int[] getConcatenation(int[] nums) {
        // int num2[]= new int[nums.length];
        // for(int i=0;i<nums.length;i++)
        // {
        //     num2[i]=nums[i];
        // }
        int res[]= new int[2*nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            res[k++]=nums[i];
        }
        k=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            res[k++]=nums[i];
        }
        return res;
    }
}