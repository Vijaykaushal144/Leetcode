class Solution {
    public int findMaxLength(int[] nums) {
        // int count=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     int ones=0;int zeros=0;
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         if(nums[j]==0)zeros++;
        //         else ones++;                
        //         if(zeros==ones)
        //     {
        //        count =Math.max(count,j-i+1);
        //     }
        //     }
        // }
        // return count;
        
        for(int i=0;i<nums.length;i++)
            if(nums[i] == 0)
                nums[i] = -1;
        
        int sum = 0;
        
        int ans = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            
            if(sum == 0)
                ans = Math.max(ans, i+1);
        
            if(!map.containsKey(sum))
                map.put(sum, i);
            else
                ans = Math.max(ans, i-map.get(sum));
        }
        
        return ans;
    }
}