class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            Integer require=target-nums[i];
            if(map.containsKey(require))
            {
                return new int[] {map.get(require),i};
            }
                map.put(nums[i],i);
        }
                return new int[] {1,-1};
        
        
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