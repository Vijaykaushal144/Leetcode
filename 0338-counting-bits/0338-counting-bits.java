class Solution {
    public int[] countBits(int n) {
        int a[]= new int[n+1];
        for(int i=0;i<=n;i++)
        {
            a[i]=res(i);
        }
        return a;
    }
    public  int res(int n)
    {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n%2==0) return res(n/2);
        else return 1+res(n/2);
    }
}