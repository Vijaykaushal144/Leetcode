class Solution {
    public int maxProfit(int[] prices) {
       int price=prices[0];
        int res=0;
        int sum=0;
        for(int i=1;i<prices.length;i++)
        {
            res=prices[i]-price;
            sum=Math.max(res,sum);
            price=Math.min(prices[i],price);
            
        }
        return sum;
        
    }
}