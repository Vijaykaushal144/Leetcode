class Solution {
    public int maxProfit(int[] prices) {
        // //int min=Integer.MAX_VALUE;
        // int maxprofit=0;
        // for(int i=1;i<prices.length;i++)
        // {
        //    int diff=prices[i]-prices[i-1];
        //     if(diff>0)
        //     {
        //         maxprofit+=diff;
        //     }
        //     // if(prices[i]<min)
        //     // {
        //     //     min=prices[i];
        //     // }
        //     // else if(maxprofit<prices[i]-min)
        //     // {
        //     //     maxprofit=prices[i]-min;
        //     // }
        // }
        // return maxprofit;
         int p=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                p+=prices[i]-prices[i-1];
            }
        }
        return p;
    }
}