class Solution {
    public double myPow(double x, long n) {
       double res=0.00;
        if(n<0)
        {
            n=Math.abs(n);
            res=1/Math.pow(x,n);
        }
        else
        {
            res=Math.pow(x,n);
        }
       return res;
            
        
    }
}