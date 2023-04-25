class Solution {
    public int findJudge(int n, int[][] trut) {
        
        if(trut.length<n-1) return -1;
        
        int trustby[]=new int[n+1];
        int trust[]=new int[n+1];
        
        for(int []rel:trut)
        {
            trust[rel[0]]++;
            trustby[rel[1]]++;
        }
        
        for(int i=1;i<n+1;i++)
        {
            if(trust[i]==0 && trustby[i]==n-1)
            {
                return i;
            }
        }
        
        return -1;
    }
}