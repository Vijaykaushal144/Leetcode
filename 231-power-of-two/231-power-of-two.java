class Solution {
    public boolean isPowerOfTwo(int n) {
        // int p=1;
        // for(int i=0;i<=30;i++)
        // {
        //     p=(int)Math.pow(2,i);
        // }
        // if(p==n) return true;
        // return false;
        
        // if(n==0 ) return false;
        // while(n/2==0) n/=2;
        // return n==1;
        return ( (n>0) &&(n&(n-1))==0);
    }
}