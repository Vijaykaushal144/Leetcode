class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[]= new int[nums.length];
        int var=1;
        for(int i=0;i<nums.length;i++)
        {
            a[i]=var;
            var=var*nums[i];
        }
        
        var=1;
        
        for(int i=nums.length-1;i>=0;i--)
        {
              a[i]=a[i]*var;
            var=var*nums[i];
          
            
            
        }
        
        return a;
    }
}