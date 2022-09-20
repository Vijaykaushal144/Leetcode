class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
       char[] s=text1.toCharArray();
        char[] p=text2.toCharArray();
        int arr[][]=new int[s.length+1][p.length+1];
       int max=0;
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[i].length;j++)
            {
                if(s[i-1]==p[j-1])
                    arr[i][j]=arr[i-1][j-1]+1;
                else
                    arr[i][j]=Math.max(arr[i][j-1],arr[i-1][j]);
            
            if(max<arr[i][j])
                max=arr[i][j];
            }
        }
        return max ;
    }
}