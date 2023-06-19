class Solution {
    public int largestAltitude(int[] a) {
        int gain=0;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            gain=Math.max(gain,sum);
        }
        
        return gain;
    }
}