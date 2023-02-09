class Solution {
    public void sortColors(int[] nums) {
        // two pointer approach for solving this;
       //  int low=0;
       //  int last=nums.length-1;
       //  int mid=0;
       // while(mid<=last)
       // {
       //     if(nums[mid]==0)
       //     {
       //         int temp=nums[low];
       //        nums[low]=nums[mid];
       //         nums[mid]=temp;
       //         low++;mid++;
       //     }
       //     else if(nums[mid]==1)
       //     {
       //         mid++;
       //     }
       //     else
       //     {
       //         int  temp=nums[mid];
       //         nums[mid]=nums[last];
       //         nums[last]=temp;
       //         last--;
       //     }
       // }
        Arrays.sort(nums);
        
    }
}