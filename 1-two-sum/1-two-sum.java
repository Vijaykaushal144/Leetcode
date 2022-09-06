class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int cmp=target-nums[i];
            if(map.containsKey(cmp))
            {
                return new int [] {map.get(cmp),i};
                
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return null;
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[j]+nums[i]==target) return new int[] {i,j};
        //     }
        // }
        // return null;
    }
}