class Solution {
    public int findPeakElement(int[] nums) {
      // int temp[] = new int[nums.length];
      //   for(int i = 0; i < nums.length ; i++){
      //       temp[i] = nums[i];
      //   }
      //   Arrays.sort(temp);
      //       int flag = 0;
      //   for (int i = 0; i < nums.length ; i++){
      //       if (nums[i] == temp[nums.length -1]){
      //           flag = i+1;
      //           break;
      //       }
      //   }
      //       return flag-1;
        
       
        int l=0;
        int r=nums.length-1;
        while(l<r) {
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[mid+1]){
                 r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;        
    }
}