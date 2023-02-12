class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3) return 0;
        int count=0;
        int a[]= new int[nums.length];
      for(int i=2;i<nums.length;i++)
      {
          if((nums[i-1]-nums[i-2])==(nums[i]-nums[i-1]))
          {
              a[i]=a[i-1]+1;
              count=count+a[i];
          }
      }
        return count;
    }
}