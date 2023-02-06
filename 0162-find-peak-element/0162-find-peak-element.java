class Solution {
    public int findPeakElement(int[] nums) {
      int temp[] = new int[nums.length];
        for(int i = 0; i < nums.length ; i++){
            temp[i] = nums[i];
        }
        Arrays.sort(temp);
            int flag = 0;
        for (int i = 0; i < nums.length ; i++){
            if (nums[i] == temp[nums.length -1]){
                flag = i+1;
                break;
            }
        }
            return flag-1;
    }
}