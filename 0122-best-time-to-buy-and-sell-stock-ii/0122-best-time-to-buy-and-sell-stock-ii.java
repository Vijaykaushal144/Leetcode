class Solution {
    public int maxProfit(int[] prices) {
      // return calculate(prices,0);
        int max=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
                max+=prices[i]-prices[i-1];
        }
        return max;
        
        
    }
//     public static int calculate(int a[],int s)
//     {
//         if(s>a.length) return 0;
//         int max=0;
//         for(int i=0;i<a.length;i++)
//         {
//             int val=0;
//             for(int j=i;j<a.length;j++)
//             {
//                 if(a[j]>a[i]){
//                    int res=calculate(a,j+1)+a[j]-a[i];
//                 if(val<res)
//                 {
//                     val=res;
//                 }
//                 }
                
//                 if(max<val) max=val;
//             }
//         }
//         return max;
    // }
}