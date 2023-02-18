class Solution {
    public int sumOfUnique(int[] nums) {
        int a[]=new int[101];
        //count the frequency of each element with the help of constraints;
        for(int i=0;i<nums.length;i++)
        {
            a[nums[i]]++;
        }
        int sum=0;
        for(int i=0;i<101;i++)
        {
            if(a[i]==1)
            {
                sum+=i;
            }
        }
        return sum;
    }
}