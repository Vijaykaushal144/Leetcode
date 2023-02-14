class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int sort[]= new int[nums.length];
       int i=0;int j=1;
        for(int p=0;p<nums.length;p++)
        {
            if(nums[p]%2==0)
            {
                sort[i]=nums[p];
                i=i+2;
            }
            else
            {
                sort[j]=nums[p];
                j=j+2;
            }
        }
        return sort;
    }
}