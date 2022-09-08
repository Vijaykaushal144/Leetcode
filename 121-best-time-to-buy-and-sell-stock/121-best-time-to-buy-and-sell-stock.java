class Solution {
    public int maxProfit(int[] prices) {
       int minvalue=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minvalue)
                minvalue=prices[i];
            
            else if(maxprofit<prices[i]-minvalue)
            {
                maxprofit=prices[i]-minvalue;
            }
        }
          
        
        return maxprofit;
    }
}