class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        if(x<0|| (x%10==0 && x!=0)) return false;
        int reverse=0;
        while(x>reverse)
        {
            
            int pop=x%10;
           
             reverse=reverse*10+pop;
            x=x/10;
        }
        return x==reverse ||x==reverse/10;
    }
}