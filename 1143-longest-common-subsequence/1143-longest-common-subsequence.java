class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
//     }
    // public static int solve(String tx1,String tx2,int i,int j)
    // {
//         if(i==tx1.length()) return 0;
//         if( j== tx2.length()) return 0;
//         int ans=0;
//         if(tx1.charAt(i)==tx2.charAt(j))
//         {
//             ans=1+solve(tx1,tx2,i+1,j+1);
//         }
//         else
//         {
//             ans= Math.max(solve(tx1,tx2,i+1,j),solve(tx1,tx2,i,j+1));
//         }
//         return ans;
//     }
// }     
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