class Solution {
    public boolean isPerfectSquare(int num) {
        
        long st=0;
        long end=num;
        while(st<=end)
        {
            long mid=st+(end-st)/2;
            if(mid*mid==num) return true;
            else if(mid*mid<num) st= mid+1;
            else end=mid-1;
        }
        return false;
    }
}