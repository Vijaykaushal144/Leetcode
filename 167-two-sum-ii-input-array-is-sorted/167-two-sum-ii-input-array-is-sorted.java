class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st=0;
        
        int end=numbers.length-1;
      while(st<end)
      {
           int sum=numbers[st]+numbers[end];
          if(sum==target)
              return new int[] {st+1,end+1};
          else if(target<sum)
          {
              end--;
          }
          else if(target>sum)
             { st++;}
                
      }
        return  new int[]{st+1,end+1};
    }
}