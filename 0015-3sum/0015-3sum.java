class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        if(nums==null || nums.length<3) return result;
         for(int i=0;i<nums.length-2;i++)
        {
            if(i==0||(i>0 && nums[i]!=nums[i-1]))
            {
                int l=i+1;
        int r=nums.length-1;
             int sum=0-nums[i];
             while(l<r)
             {
                 if(nums[l]+nums[r]==sum)
                 {
                         result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                         // result.add(nums[l]);
                         // result.add(nums[r]);
                     while(l<r && nums[l]==nums[l+1]) l++;
                     while(l<r && nums[r]==nums[r-1]) r--;
                     
                     l++;
                     r--;
                 }
                 else if(nums[l]+nums[r]<sum) l++;
                 else r--;
             }
            }
        }
        
        return result;
    }
} 