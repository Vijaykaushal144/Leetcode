class Solution {
    public long putMarbles(int[] weights, int k) {
        int pairsum[]= new int[weights.length-1];
        for(int i=0;i<weights.length-1;i++)
        {
            pairsum[i]=weights[i]+weights[i+1];
        }
        Arrays.sort(pairsum);
        long min=0;
        long max=0;
        for(int i=0;i<k-1;i++)
        {
            min+=pairsum[i];
            max+=pairsum[pairsum.length-i-1];
        }
        return max-min;
    }
}