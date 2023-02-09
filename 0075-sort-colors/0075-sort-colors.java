class Solution {
    public static void sortColors(int[] nums) {
        // two pointer approach for solving this;
       
//         for(int i=0;i<nums.length;i++)
//         {
//             int minindex=i;
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[j]<=nums[minindex])
//                 {
//                     minindex=j;
                   
//                 }
//                  // swap(nums[minindex],nums[i]);
//                 int temp=nums[minindex];
//                 nums[minindex]=nums[i];
//                 nums[i]=temp;
                
//             }
        int st=0;
        int mid=0;
        int len=nums.length-1;
        while(mid<=len)
        {
            switch(nums[mid])
            {
                case 0:{
                    int temp=nums[mid];
                    nums[mid++]=nums[st];
                    nums[st++]=temp;
                    break;
                }
                case 1:
                    {
                        mid++;
                        break;
                    }
                case 2:
                    {
                        int temp=nums[mid];
                        nums[mid]=nums[len];
                        nums[len--]=temp;
                        break;
                    }
                    
                    
            }
        }
        }
        
    
}